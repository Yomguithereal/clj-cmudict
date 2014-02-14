;; -------------------------------------------------------------------
;; clj-cmudict Core
;; -------------------------------------------------------------------
;;
;;
;;   Author: PLIQUE Guillaume (Yomguithereal)
;;   Version: 0.1
;;
(ns clj-cmudict.core
  (:require [clj-cmudict.dict :as d]
            clojure.string))

(defn- prepare-word
  "Format a [word] into the cmudict format."
  [word]
  (clojure.string/upper-case word))

(defn arpabet
  "Get the arpabet sequence for a given [word]."
  [word]
  (get d/cmu-map (prepare-word word)))
