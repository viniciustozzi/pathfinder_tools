(ns pathfinder-tools.core
  (:require
    [reagent.core :as r]
    [pathfinder-tools.components.biography :refer [biography]]
    [pathfinder-tools.components.skills :refer [skills]]
    [pathfinder-tools.components.sheet :refer [sheet]]
    [pathfinder-tools.components.weapons :refer [weapons]]
    [pathfinder-tools.components.items :refer [items]]))
;; -------------------------
;; Views

(def char-set (r/atom {:items []}))

(defn home-page
  []
  [:div
   [:h2 "Welcome to Pathfinder Tools"]
   [:p]
   [sheet]
   [biography char-set]
   [skills]
   [sheet]
   ;[weapons char-set]
   [items char-set]])
;; -------------------------
;; initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
