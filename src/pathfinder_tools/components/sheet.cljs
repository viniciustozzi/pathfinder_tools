(ns pathfinder-tools.components.sheet
  (:require [pathfinder-tools.components.ui :as ui]))

(defn- ability-values
  [name]
  [:div.columns
   [:div.column name]
   [:div.column (ui/input "Ability Score")]
   [:div.column (ui/input "Ability Modifier")]])

(defn- init-values
  []
  [:div
   [:div.columns
    [:div.column "INITIAVE"]
    [:div.column (ui/input "Total")]
    [:div.column (ui/input "Dex Modifier")]
    [:div.column (ui/input "Misc Modifier")]]])
    
(defn sheet
  []
  [:div
   (ui/title "Character Sheet")
   (ability-values "STR")
   (ability-values "DEX")
   (ability-values "CON")
   (ability-values "INT")
   (ability-values "WIS")
   (ability-values "CHA")])
