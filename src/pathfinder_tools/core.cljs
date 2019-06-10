(ns pathfinder-tools.core
    (:require
     [reagent.core :as r]
     [pathfinder-tools.components.biography :refer [biography]]))

;; -------------------------
;; Views

(defn home-page
  []
  [:div
   [:h2 "Welcome to Pathfinder Tools"]
   [biography]])

;; -------------------------
;; initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
