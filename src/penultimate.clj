(ns penultimate)

(defn penultimate [list]
  (if (= 2 (count list))
    (first list)
    (recur (rest list))))

(print (penultimate '(1 2 3 4)))