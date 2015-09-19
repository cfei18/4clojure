; https://www.4clojure.com/problem/24

(ns sum-seq)

(defn sum-seq [input]
  (if (empty? input)
    0
    (+ (first input) (sum-seq (rest input))))
  )

(defn sum-seq2 [input]
  (reduce + input))

(println (sum-seq [1 2 3]))
(println (sum-seq2 [1 2 3]))
