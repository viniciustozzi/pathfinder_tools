(ns pathfinder-tools.components.items
  (:require [pathfinder-tools.components.ui :as ui]
            [reagent.core :as r]
            [pathfinder-tools.char-sheet :as char]))

(defn- make-new-item
  [char-sheet]
  (conj char-sheet {:name "" :weight 0}))

(defn- make-add-item-button
  [char-sheet]
  [:div.button
   [ui/button "Add Item" #(swap! char-sheet make-new-item)]])

(defn- make-item-ui
  [index values char-sheet]
  [:div {:key index}
   [ui/atom-input "Name" char-sheet #(get-in [:items index :name] %) #(char/change-item-name %1 index %2)]
   [ui/atom-input "Weight" char-sheet #(get-in [:items index :weight] %) #(char/change-item-weight %1 index %2)]])

(defn  items
  [char-sheet]
  [:div
   [:div.items (map-indexed #(make-item-ui %1 %2 char-sheet) @char-sheet)]])
   ; (make-add-item-button char-sheet)])
