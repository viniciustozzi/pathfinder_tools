(ns pathfinder-tools.components.ui)

(defn input
  ([placeholder]
   [:div.field
    [:label.label placeholder]
    [:div.control>input.input.is-primary {:placeholder placeholder}]]))

(defn atom-input
  [placeholder atom value-fn on-change]
  [:div.field
   [:label.label placeholder]
   [:div.control>input.input.is-primary {:placeholder placeholder
                                         :type        "text"
                                         :value       (value-fn @atom)
                                         :on-change   #(swap! atom on-change (-> % .-target .-value))}]])
(defn title
  [title]
  [:h1.title title])

(defn button
  [text on-click]
  [:button.button.tooltip
   {:on-click on-click} text])
