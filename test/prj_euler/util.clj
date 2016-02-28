(ns prj-euler.util)

(defn mult-of? [num]
  #(= (mod % num) 0))

(def fib-seq
  ((fn fib [prev current]
     (lazy-seq
       (cons prev (fib current (+ prev current)))))
    1 1))
