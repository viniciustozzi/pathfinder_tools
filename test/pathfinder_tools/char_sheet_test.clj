(ns pathfinder-tools.char-sheet-test
  (:require [clojure.test :refer :all]
            [pathfinder-tools.char-sheet :refer :all]))

(deftest armor
  (testing "Armor"
    (is (= {:weapons '({:name "heart of tarrask"})}
           (add-weapon {} {:name "heart of tarrask"})))))

(deftest hp
  (testing "HP"
    (is (= {:hp 3}
           (set-hp {} 3)))))

(deftest ability
  (testing "Ability modifier"
    (is (= -3 (get-ability-modifier 5)))
    (is (= -3 (get-ability-modifier 4)))))