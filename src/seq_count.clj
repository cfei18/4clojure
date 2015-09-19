(ns seq-count)

(defn seq-count [input]
  (if (empty? input)
    0
    (inc (seq-count (rest input)))))

(print (seq-count '(1 2 3 4 )))