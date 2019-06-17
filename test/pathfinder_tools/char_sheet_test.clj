(ns pathfinder-tools.char-sheet-test
  (:require [clojure.test :refer :all]
            [pathfinder-tools.char-sheet :refer :all]))

(testing "Armor"
  (testing "With empty set"
    (is (= {:weapons '({:name "heart of tarrask"})}
           (add-weapon {} {:name "heart of tarrask"})))))

(testing "HP"
  (testing "With empty set"
    (is (= {:hp 3}
           (set-hp {} 3)))))

(testing "Ability modifier"
  (testing ""
    (is (= -3 (get-ability-modifier 5)))
    (is (= -3 (get-ability-modifier 4)))))