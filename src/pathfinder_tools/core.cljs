(ns pathfinder-tools.core
    (:require
     [reagent.core :as r]
     [pathfinder-tools.components.biography :refer [biography]]
     [pathfinder-tools.components.skills :refer [skills]]))

;; -------------------------
;; Views

(defn home-page
  []
  [:div
   [:h2 "Welcome to Pathfinder Tools"]
   [biography]
   [skills]])

;; -------------------------
;; initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))