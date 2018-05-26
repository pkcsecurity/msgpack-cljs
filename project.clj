(defproject msgpack-cljs "0.1.0-SNAPSHOT"
  :description "A ClojureScript library for serializing and deserializing to msgpack."
  :plugins [[lein-cljsbuild "LATEST"]]
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojure "LATEST"]
                 [org.clojure/clojurescript "LATEST"]]
  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["cljs-src"]
                :compiler
                {:output-to "static/development/index.js"
                 :source-map true
                 :output-dir "static/development/js"
                 :optimizations :none
                 :main msgpack-cljs.core
                 :asset-path "/development/js"
                 :cache-analysis true
                 :pretty-print true}}
               {:id "release"
                :source-paths ["cljs-src"]
                :compiler
                {:output-to "static/release/index.js"
                 :source-map "static/release/index.js.map"
                 :main msgpack-cljs.core
                 :output-dir "static/release/js"
                 :optimizations :advanced
                 :pseudo-names false}}]})
