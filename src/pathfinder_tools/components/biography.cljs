(ns pathfinder-tools.components.biography)

(defn- input
  [placeholder]
  [:div.field
   [:label.label placeholder]
   [:div.control>input.input.is-primary {:placeholder placeholder}]])


(defn- title
  [title]
  [:h1.title title])

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
