;; -------------------------------------------------------------------
;; clj-cmudict Dictionary Tests
;; -------------------------------------------------------------------
;;
;;
;;   Author: PLIQUE Guillaume (Yomguithereal)
;;   Version: 0.1
;;
(ns clj-cmudict.dict-test
  (:require [clojure.test :refer :all]
            [clj-cmudict.dict :refer :all]))


(deftest lookup-test
  (is (= ['(:SH :AY1 :N)] (get cmu-map "SHINE")))
  (is (= ['(:SH :UW1 :Z)] (get cmu-map "SHOES")))
  (is (= ['(:B :EH1 :N :T)] (get cmu-map "BENT")))
  (is (= ['(:OW1 :V :ER0)] (get cmu-map "OVER"))))
