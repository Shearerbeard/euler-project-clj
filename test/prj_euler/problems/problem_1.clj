(ns prj-euler.problems.problem-1
  (require [prj-euler.util :refer [mult-of?]]))


(def rng (range 1 1000))

(def mult-of-3 (mult-of? 3))
(def mult-of-5 (mult-of? 5))

(defn mult-3s-and-5s []
  (reduce + (filter #(or
                      (mult-of-3 %)(mult-of-5 %))
                    rng)))