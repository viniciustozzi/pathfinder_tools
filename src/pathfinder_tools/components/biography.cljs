(ns pathfinder-tools.components.biography
  (:require [pathfinder-tools.components.ui :as ui]
            [pathfinder-tools.char-sheet :as char]))

(defn biography
  [char-set]
  [:div (ui/title "Player Bio")
   (ui/atom-input "Character Name" char-set #(:name %) char/update-name)
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
