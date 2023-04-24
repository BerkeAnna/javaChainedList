package hu.ak.linkedList_DoublyLinkedList;

import hu.ak.linkedList_DoublyLinkedList.Main;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList numbers = new DoublyLinkedList();
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
		System.out.println(numbers.contains(17));

	}

}
