package hu.ak.linkedList_remove;

import hu.ak.linkedList_remove.Main;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		System.out.println(numbers.add(8));
		System.out.println(numbers.add(42));
		System.out.println(numbers.add(32));
		System.out.println(numbers.add(17));
		System.out.println(numbers.add(42));
		System.out.println(numbers.add(73));
		System.out.println("--------------------");
		numbers.deleteFirst(42);
		numbers.print();
		System.out.println("--------------------");
		numbers.deleteAll(42);
		numbers.print();

	}

}
