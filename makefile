C = javac
JAVADOC = javadoc
.SUFFIXES: .java .class
.java.class:
	$(C) $*.java

CLASSES = \
        ListNode.java \
        FibNode.java \
        LinkedList.java \
        Main.java 

default: classes

classes: $(CLASSES:.java=.class)

largeRand:
	java Number 10000 0 1 10000 data.txt

clean:
	$(RM) *.class

doc::
	javadoc -d doc/ -sourcepath ./*.java 
