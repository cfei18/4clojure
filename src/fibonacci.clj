(ns fibonacci)

(defn fibonacci [n]
  (if (or (= n 0) (= n 1))
    1
    (cons 
    (+
      (fibonacci (- n 1))
      (fibonacci (- n 2)))))

(println (fibonacci 5))
