(ns pathfinder-tools.char-sheet)

(def add-weapon [char-set weapon]
  (assoc char-set :weapons (into (:weapons char-set) add-weapon)))
