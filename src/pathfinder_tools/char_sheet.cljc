(ns pathfinder-tools.char-sheet)

(defn add-weapon
  [char-set weapon]
  (assoc char-set :weapons (conj (:weapons char-set) weapon)))

(defn set-hp [char-set hp]
  (assoc char-set :hp hp))

(defn get-ability-modifier [ability-score]
  (- (int (/ ability-score 2)) 5))
