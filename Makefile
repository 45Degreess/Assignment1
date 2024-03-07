JC = javac
JAVA = java

#Flags for java command
JCFLAGS = --module-path "lib/" --add-modules AbsoluteLayout -d "bin"
JFLAGS = --module-path "lib/" --add-modules AbsoluteLayout -cp "bin"
SOURCES = $(wildcard src/App/*.java)

build:
	$(JC) $(JCFLAGS) $(SOURCES)

run:
	$(JAVA) $(JFLAGS) App.MainMenu

deafult:
	build

clean:
	rm bin/App/*.class
