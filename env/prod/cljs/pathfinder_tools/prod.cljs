(ns pathfinder-tools.prod
  (:require [pathfinder-tools.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
