package jspiderbtm.demoapp.tostr;

import java.util.LinkedList;

public class ExampleLinkedList {
public static void main(String[] args) {
	LinkedList<String> l = new LinkedList<String>();
	l.add("abc");
	l.add("def");
	l.add("fgh");
	l.add(null);
	l.add(null);
	System.out.println(l);
}
}
