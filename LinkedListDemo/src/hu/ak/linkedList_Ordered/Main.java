package hu.ak.linkedList_Ordered;

import hu.ak.linkedList_Ordered.Main;

public class Main {

	public static void main(String[] args) {
		OrderedLinkedList numbers = new OrderedLinkedList();
		numbers.add(8);
		numbers.add(42);
		numbers.add(32);
		numbers.add(17);
		numbers.add(42);
		numbers.add(73);
		System.out.println(numbers.getElementsAsString());
		System.out.println("--------------------");
		numbers.deleteAll(42);
		System.out.println(numbers.getElementsAsString());

	}

}
