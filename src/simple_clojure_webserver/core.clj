(ns simple-clojure-webserver.core
  (:require [org.httpkit.server :as http-kit]))

(defn render [req]
  (println (pr-str req))
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello World"})

(defn -main [& args]
  (let [p 8000]
    (http-kit/run-server render {:ip "0.0.0.0", :port p})
    (println "Server running on port" p)))
