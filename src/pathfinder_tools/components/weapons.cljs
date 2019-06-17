(ns pathfinder-tools.components.weapons
  (:require [pathfinder-tools.components.ui :refer [title input button]]
            [reagent.core :as r]))

(defn- make-weapon-ui
  []
  [:div.weapon
   (title "Weapon")
   (input "Name")
   (input "Attack Bonus")
   (input "Critical")
   (input "Type")
   (input "Range")
   (input "Ammunition")
   (input "Damage")])

(defn weapons
  [weapon-set]
  [:div
   (map make-weapon-ui (range @weapon-set))
   (button "Add new weapon" #(swap! weapon-set inc))])
