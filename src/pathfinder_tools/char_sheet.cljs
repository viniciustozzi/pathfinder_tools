(ns pathfinder-tools.char-sheet)

(defn add-weapon
  [char-set weapon]
  (assoc char-set :weapons (into (:weapons char-set) weapon)))

(defn set-hp
  [char-set hp]
  (assoc char-set :hp hp))

;;check floor function
(defn get-ability-modifier
  [ability-score]
  (floor (-(/ ability-score 2)  5)))
