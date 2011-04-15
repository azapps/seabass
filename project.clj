(defproject seabass "0.1"
  :description "A library for working with RDF in the Incanter environment."
  :dev-dependencies [[lein-clojars "0.6.0"]]
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [com.hp.hpl.jena/arq "2.8.7"]
				 [com.ibm.icu/icu4j "3.4.4"]
				 [com.hp.hpl.jena/iri "0.8"]
                 [com.hp.hpl.jena/jena "2.6.4"]
				 [junit "4.5"]
                 [log4j "1.2.13"]
				 [org.apache.lucene/lucene-core "2.3.1"]
                 [org.slf4j/slf4j-api "1.5.8"]
				 [org.slf4j/slf4j-log4j12 "1.5.8"]
				 [stax/stax-api "1.0.1"]
				 [org.codehaus.woodstox/wstx-asl "3.2.9"]
				 [xerces/xercesImpl "2.7.1"]
				 [incanter "1.2.3"]
				]
  :main seabass.core
  )