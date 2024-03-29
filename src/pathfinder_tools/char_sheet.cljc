(ns pathfinder-tools.char-sheet)

(defn add-weapon
  [char-set weapon]
  (assoc char-set :weapons (conj (:weapons char-set) weapon)))

(defn set-hp
  [char-set hp]
  (assoc char-set :hp hp))

(defn get-ability-modifier
  [ability-score]
  (- (int (/ ability-score 2)) 5))

(defn update-name
  [char-set name]
  (assoc char-set :name name))

(defn change-item-name
  [item-set index new-name]
  (assoc-in item-set [:items index :name] new-name))

(defn change-item-weight
  [item-set index new-weight]
  (assoc-in item-set [:items index :weight] new-weight))

(defn get-armor-class
  "We should create arity to calculate this without the dex-mode"
  [armor shield dex-mod other]
  (+ armor shield dex-mod other))
