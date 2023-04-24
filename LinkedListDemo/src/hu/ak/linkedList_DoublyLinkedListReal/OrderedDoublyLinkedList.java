package hu.ak.linkedList_DoublyLinkedListReal;

import hu.ak.linkedList_DoublyLinkedListReal.Link;


public class OrderedDoublyLinkedList extends DoublyLinkedListReal {

	@Override
	public boolean add(int number) {
		boolean isAlreadyInList = contains(number);
		Link current = first.getNext();
		while(!current.isBound() && current.getValue() < number) {
		
			current = current.getNext();
		}
		Link newLink = new Link(number);
		Link prev = current.getPrevious();
		newLink.setPrevious(prev);
		newLink.setNext(current);
		prev.setNext(newLink);
		current.setPrevious(newLink);
		
		return !isAlreadyInList;
	}
	
}
