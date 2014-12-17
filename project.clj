(defproject bultitude "0.2.6-fx-SNAPSHOT"
  :min-lein-version "2.0.0"
  :description "A library for find Clojure namespaces on the classpath."
  :url "https://github.com/Raynes/bultitude"
  :license {:name "Eclipse Public License 1.0"}
  :dependencies [[org.clojure/clojure "1.7.0-fx-SNAPSHOT"]
                 [org.tcrawley/dynapath "0.2.3"]]
  :aliases {"test-all" ["with-profile" "dev,default:dev,1.3,default:dev,1.2,default" "test"]}
  :profiles {:1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.2 {:dependencies [[org.clojure/clojure "1.2.1"]]}})
