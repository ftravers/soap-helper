(ns com.oracle.git.ngsp.SoapHelper
  (:gen-class
   :name com.oracle.git.ngsp.SoapHelper
   :methods [#^{:static true} [greet [] String]]
   :use [clojure.xml]))
(defn greet[] "Hello Fenton!")
(defn -greet
  "A 'static' wrapper around 'greet' function."
  []
  (greet))
(defn get-xml[]
  ())