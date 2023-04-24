package hu.ak.linkedList_DoublyLinkedListReal;

public class Link {

	
	private final int value;
	private Link next;
	private Link previous;
	private boolean bound;
	
	
	
	public Link(boolean bound) {
		this.bound = bound;
		this.value = 0;
	}

	public Link(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public Link getPrevious() {
		return previous;
	}

	public void setPrevious(Link previous) {
		this.previous = previous;
	}

	public boolean isBound() {
		return bound;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}
	
	
}
