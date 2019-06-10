(ns pathfinder-tools.components.sheet
  (:require [pathfinder-tools.components.ui :as ui]))

(defn- ability-values
  [name]
  [:div.columns
   [:div.column name]
   [:div.column (ui/input "Ability Score")]
   [:div.column (ui/input "Ability Modifier")]])

(defn sheet
  []
  [:div
   (ui/title "Character Sheet")
   (ability-values "STR")])
