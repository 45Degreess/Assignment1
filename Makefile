JC = javac
JAVA = java

#Flags for java command
JCFLAGS = --module-path "lib/" --add-modules AbsoluteLayout -d "bin" src/App/*.java
JFLAGS = --module-path "lib/" --add-modules AbsoluteLayout -cp "bin" App.MainMenu

build:
	$(JC) $(JCFLAG)

run: 
	$(JAVA) $(JFLAGS)

deafult: 
	build

clean:
	rm -cp bin/App/*.class
