package hu.ak.linkedList_remove;

import hu.ak.linkedList_remove.Link;

public class Link {
	
	private int number;
	private Link next;
	
	public Link(int number) {
		this.number = number;
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
	
	
	

}
