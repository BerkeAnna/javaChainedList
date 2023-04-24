package hu.ak.linkedList_DoublyLinkedListReal;


import hu.ak.linkedList_DoublyLinkedListReal.Main;

public class Main {

	public static void main(String[] args) {
		OrderedDoublyLinkedList nums = new OrderedDoublyLinkedList();
		nums.add(42);
		nums.add(2);
		nums.add(40);
		nums.add(17);
		nums.add(42);
		System.out.println(nums.getElementsAsString());
		System.out.println("------------------------");
		nums.deleteAll(42);
		System.out.println(nums.getElementsAsString());

	}

}
