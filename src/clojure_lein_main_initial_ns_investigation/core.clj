(ns clojure-lein-main-initial-ns-investigation.core
  (:gen-class))

(defn -main [& args]
  (println "Inital ns is" (ns-name *ns*)))

;; Output is:
;;
;;    Inital ns is clojure.core
