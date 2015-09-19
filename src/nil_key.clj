(ns nil-key)

(defn nil-key-check [key map]
  (nil? (get map key "sentinel")))

(print (nil-key-check :a {:b 2}))
