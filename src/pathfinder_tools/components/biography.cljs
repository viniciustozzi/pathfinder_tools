(ns pathfinder-tools.components.biography
  (:require [pathfinder-tools.components.ui :as ui]))

(defn biography
  []
  [:div (ui/title "Player Bio")
   (ui/input "Character Name")
   (ui/input "Player")
   (ui/input "Race")
   (ui/input "Class")
   (ui/input "Level")
   (ui/input "Gender")
   (ui/input "Age")
   (ui/input "Deity")
   (ui/input "Homeland")
   (ui/input "Height")
   (ui/input "Weight")])
