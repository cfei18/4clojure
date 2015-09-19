(ns reverse)

(defn reverse-seq [input]
  (if (empty? input)
    []
    (conj (reverse-seq (rest input)) (first input))))

(print (reverse-seq [1 2 3]))