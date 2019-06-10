(ns pathfinder-tools.components.sheet)

(defn- title
  [title]
  [:h1.title title])

(defn ability-values
  [name]
  [:div])

(defn sheet
  []
  [:div
   (title "Character Sheet")])
