(ns find-odds)

(defn find-odds [input]
  (filter
    (fn [x] (= 1 (mod x 2)))
    input))

(defn find-odds2 [input]
  (filter
    #(= 1 (mod % 2))
    input))

(defn find-odds3 [input]
  (filter
    odd?
    input))

(println (find-odds '(1 2 3 4 5)))
(println (find-odds2 '(1 2 3 4 5)))
(println (find-odds3 '(1 2 3 4 5)))
