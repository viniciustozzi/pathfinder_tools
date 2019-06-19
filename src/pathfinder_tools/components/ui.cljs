(ns pathfinder-tools.components.ui)

(defn input
  ([placeholder text]
   [:div.field
    [:label.label placeholder]
    [:div.control>input.input.is-primary {:placeholder placeholder} @text]])
  ([placeholder]
   [:div.field
    [:label.label placeholder]
    [:div.control>input.input.is-primary {:placeholder placeholder}]]))

(defn atom-input [placeholder a out]
  [:div.field
   [:label.label placeholder]
   [:div.control>input.input.is-primary {:placeholder placeholder
                                         :type        "text"
                                         :value       (:name @a)
                                         :on-change   #(swap! a out (-> % .-target .-value))}]])


(defn title
  [title]
  [:h1.title title])

(defn button
  [text on-click]
  [:button.button.tooltip
   {:on-click on-click} text])
