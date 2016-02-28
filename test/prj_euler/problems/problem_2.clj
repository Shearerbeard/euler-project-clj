(ns prj-euler.problems.problem-2
  (:require [prj-euler.util :refer [fib-seq]]))

; - Old Recursive Solution

;(defn even-fibbonaci-to-lim [lim]
;  (loop [first 0 second 1 sum 0]
;    (if (<= second lim)
;      (let [updated-sum
;            (if (= (mod second 2) 0)
;              (+ sum second)
;              sum)]
;        (recur second (+ first second) updated-sum))
;      sum)))

(defn sum-even-fib-to-limit [lim]
  (reduce + (filter odd?
                    (take-while #(< % lim) fib-seq))))

(defn even-fibbonaci-to-4000000 []
  (sum-even-fib-to-limit 4000000))
