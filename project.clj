(defproject tree-lang "0.1.0-SNAPSHOT"
  :description ""
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [adzerk/boot-test "1.2.0" :scope "test"]
                 [org.antlr/antlr4 "4.7.1"]]
  ;; To make use of ANTLR 4.7.1. Latest available is 0.3.0
  :plugins [[lein-antlr "0.4.0-SNAPSHOT"]]
  :antlr-src-dir "src/antlr"
  :antlr-dest-dir "gen/java/generated"
  :antlr-options {:package "generated"}
  :profiles {:dev {:dependencies
                   [[criterium "0.4.4"]
                    [org.clojure/test.check "0.9.0"]
                    [instaparse "1.4.2"]]}}
  :java-source-paths ["gen/java"]
  :javac-options ["-Xlint:deprecation"]
  :source-paths ["src/clojure"]
  :test-selectors {:default (complement :perf)
                   :perf :perf
                   :all  (fn [_] true)}
  :global-vars {*warn-on-reflection* false})
