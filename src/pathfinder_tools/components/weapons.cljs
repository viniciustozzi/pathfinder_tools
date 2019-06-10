(ns pathfinder-tools.components.weapons
  (:require [pathfinder-tools.components.ui :refer [title input]]
            [reagent.core :as r]))

(def weapon-set (r/atom 1))

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
  []
  [:div
   (map make-weapon-ui (range @weapon-set))
   [:button.button.tooltip
    {:data-tooltip "Add new weapon"
     :on-click #(swap! weapon-set inc)} "Add new Weapon"]])
