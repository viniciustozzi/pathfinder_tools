(ns pathfinder-tools.components.ui)

(defn input
  [placeholder]
  [:div.field
   [:label.label placeholder]
   [:div.control>input.input.is-primary {:placeholder placeholder}]])


(defn title
  [title]
  [:h1.title title])