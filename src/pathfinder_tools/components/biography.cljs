(ns pathfinder-tools.components.biography
  (:require [pathfinder-tools.ui :refer [title input]]))

(defn biography
  []
  [:div (title "Player Bio")
   (input "Character Name")
   (input "Player")
   (input "Race")
   (input "Class")
   (input "Level")
   (input "Gender")
   (input "Age")
   (input "Deity")
   (input "Homeland")
   (input "Height")
   (input "Weight")])
