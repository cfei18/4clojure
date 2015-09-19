; https://www.4clojure.com/problem/solutions/31

(ns group-lists)

(defn group-lists [in]
  (letfn [(inner [in out sublist]
                 (let [firstelmt (first in), firstsublist (first sublist)]
                   ;(print (str "First elem: " firstelmt "\n"))
                   ;(print (str "First sublist: " firstsublist "\n"))
                   (if (or (= nil firstsublist) (= firstsublist firstelmt))
                     (do
                       (print (str "recurse1 with " (rest in) " , " out " , " (conj sublist firstelmt) "\n"))
                       (inner
                         (rest in)
                         out
                         (conj sublist firstelmt)))

                     ; then we need to flush out the sublist to out
                     (do
                       (if (not (= nil firstelmt))
                         (do
                           (print (str "recurse2 with " (rest in) " , " (conj out sublist) " , " `(~firstelmt) "\n"))
                           (inner
                             (rest in)
                             (conj out sublist)
                             `(~firstelmt)))
                         (conj out sublist)))
                     ))

                 )]
    (inner in '() '())))


(print (group-lists [1 1 2 3]))
