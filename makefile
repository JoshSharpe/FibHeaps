C = javac
JAVADOC = javadoc
.SUFFIXES: .java .class
.java.class:
	$(C) $*.java

CLASSES = \
        ListNode.java \
        FibNode.java \
        LinkedList.java \
		FibHeap.java \
        Main.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

doc::
	javadoc -d doc/ -sourcepath ./*.java 
