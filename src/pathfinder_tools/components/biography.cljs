(ns pathfinder-tools.components.biography)

(defn- input
  [placeholder]
  [:div.field
   [:label.label placeholder]
   [:div.control>input.input.is-primary {:placeholder placeholder}]])

(defn biography
  []
  [:div (input "Character Name")
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
