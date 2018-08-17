(ns entish.antlr4
  (:import [generated EntishLexer EntishParser]
           [org.antlr.v4.runtime CharStreams CommonTokenStream]))



;; EntishLexer extends org.antlr.v4.runtime.Lexer
;; EntishParser extends org.antlr.v4.runtime.Parser
;;
;; EntishParser(org.antlr.v4.runtime.TokenStream(i) input)
;; org.antlr4.v4.runtime.CommonTokenStream implements TokenStream
;; CommonTokenStream(TokenSource(i) tokenSource)
;; Lexer implements TokenSource
;; Lexer(org.antlr.v4.runtime.CharStream(i) input)
;; org.antlr.v4.CharStreams/fromFileName(String fileName)

(EntishLexer/_serializedATN)

(defn parse
  [file-name]
  (let [stream (CharStreams/fromFileName file-name)
        lexer (EntishLexer. stream)
        tokens (CommonTokenStream. lexer)
        parser (EntishParser. tokens)
        tree (.file_input parser)]
    {:tree (.getText tree)
     :tokens (.getTokens tokens)
     }))

(parse "test/input/simple.py")
