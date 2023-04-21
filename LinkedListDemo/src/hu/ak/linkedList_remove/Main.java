package hu.ak.linkedList_remove;

import hu.ak.linkedList_remove.Main;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		System.out.println(numbers.simpleAddBackwards(8));
		System.out.println(numbers.simpleAddBackwards(42));
		System.out.println(numbers.simpleAddBackwards(32));
		System.out.println(numbers.simpleAddBackwards(17));
		System.out.println(numbers.simpleAddBackwards(42));
		System.out.println(numbers.simpleAddBackwards(73));
		System.out.println(numbers.getElementsAsString());
		System.out.println("--------------------");
		numbers.deleteAll(42);
		System.out.println(numbers.getElementsAsString());

	}

}
