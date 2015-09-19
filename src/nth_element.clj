(ns nth-element)

(defn nth-element [list n]
  (if (= n 0)
    (first list)
    (recur (rest list) (dec n))))

(print (nth-element '(1 2 3 4 5) 3))