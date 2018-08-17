(ns entish.core
  (:require [instaparse.core :as insta]
            [clojure.pprint :refer [pprint]])
  (:import parsers.Python3Lexer))





(def p1
  (insta/parser
    (str "S = AB*"
         "AB = 'a'+ 'b'+")))

(defn -main []
  (print "Hello world!")
  )



                                        ;(parser "aaababbb")

;; (def p2
;;   (insta/parser
;;     "program = <ows> statement (<ows> <sep> <ows> statement)* <ows>
;; sep = <ows> (<newline> | ';') <ows>
;; newline = '\\n'
;; <statement> = conditional | assignment
;; conditional = if <ows> (elif <ows>)+ (else <ows>)?
;; <if> = <'if'> <ws> expression <ows> <':'> <ws> program
;; <elif> = <'elif'> <ws> expression <ows> <':'> <ws> program
;; <else> = <'else'> <ows> <':'> <ws> program
;; <expression> = bool-lit | int-lit | string-lit | identifier
;; assignment = identifier <ows> <'='> <ows> expression
;; identifier = #'[a-z][a-zA-Z0-9]*'
;; <ws> = #'\\s+'
;; <ows> = #'\\s*'
;; bool-lit = 'True' | 'False'
;; string-lit = <'\"'> #'[^\"]*' <'\"'>
;; int-lit = #'\\d+'
;; "))


;; (p2 "if \"True\": x = 1 else x = 2")



;; (def program
;;   "
;; if \"Android\":
;;    s = 1
;;    u = 2
;; elif weather:
;;    s = 2
;; else: s = 3
;; ")


;; (pprint (p2 program))
