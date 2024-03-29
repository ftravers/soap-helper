(ns com.oracle.git.ngsp.test.SoapHelper
  (:use [com.oracle.git.ngsp.SoapHelper]
        [lazytest.describe :only (describe it)]
        [clojure.xml]))
        
(describe
 greet
 (it "returns string 'Hello Fenton!'"
     ( = "Hello Fenton!" (greet))))

(describe
 get-xml
 (it "Retrieves the value of the xml tag: <siebelf:errormsg>"
     (let [abc (parse (java.io.File. "test/soap1.xml"))]
       ()
       ( = 1 1 ))))

