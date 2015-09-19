(ns default-map-values)

(defn default-map-values [value keys]
  (when-not (empty? keys)
    (merge (assoc {} (first keys) value) (default-map-values value (rest keys))))
  )

(print (default-map-values 0 [1 2 3]))