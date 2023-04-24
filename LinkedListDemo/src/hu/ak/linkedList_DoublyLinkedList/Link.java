package hu.ak.linkedList_DoublyLinkedList;

import hu.ak.linkedList_DoublyLinkedList.Link;

public class Link {
	
	private int number;
	private Link next;
	private boolean bound;
	
	public Link(int number) {
		this.number = number;
	}

	public Link(boolean bound) {
		super();
		this.bound = bound;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public boolean isBound() {
		return bound;
	}

	public void setBound(boolean bound) {
		this.bound = bound;
	}
	
	
	

}
