
BASE := antlr4
GRAMMAR := Python3
ANTLR4_JAR := ${BASE}/lib/antlr4-runtime-4.7.1.jar

.PHONY: jar
jar: ./lib/${GRAMMAR}.jar

.PHONY: clean
clean:
	-rm -r ${BASE}/build

${BASE}/build/${GRAMMAR}.jar: ${BASE}/build ${BASE}/${GRAMMAR}.g4
	antlr4 -o ${BASE}/build -package parsers ${BASE}/${GRAMMAR}.g4
	javac -cp ${ANTLR4_JAR} ${BASE}/build/${BASE}/*.java
	jar cvf $@ ${BASE}/build/${BASE}/*.class

./lib/${GRAMMAR}.jar: ${BASE}/build/${GRAMMAR}.jar ./lib
	cp $< $@

${BASE}/build:
	mkdir -p $@

./lib:
	mkdir -p $@
