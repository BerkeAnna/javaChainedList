package hu.ak.linkedList_DoublyLinkedList;

import hu.ak.linkedList_DoublyLinkedList.DoublyLinkedList;

public class DoublyLinkedList {
	
	private Link first = new Link(true);
	
	public boolean contains(int number) {
		Link current = first.getNext();
		while(current  != null) {
			if( current.getNumber() ==number ) {
				return true;
			}
			current= current.getNext();
		}
		return false;
	}
	
	public boolean add(int number)
	{
		boolean alreadyExists = contains(number);
		Link newLink = new Link(number);
		Link second = first.getNext();
		newLink.setNext(second);
		first.setNext(newLink);
		
		return !alreadyExists;
	}
	
	public void deleteFirst(int number) {
		Link current = first.getNext();
		Link previous = first;
		while(current != null) {
			if(current.getNumber() == number) {
					previous.setNext(current.getNext());
			}else {
				previous = current;
			}
			
			current = current.getNext();
		}
			
	}
	
	public void deleteAll(int number) {
		Link current = first.getNext();
		Link previous = first;
		while(current != null) {
			if(current.getNumber() == number) {
					previous.setNext(current.getNext());
			}else {
				previous = current;
			}
			
			current = current.getNext();
		}
			
	}
	
	
	public String getElementsAsString()
	{
		StringBuilder result = new StringBuilder();
		Link current = first.getNext();
		while(current != null) {
			if(first.getNext() != current) {
			result.append(" - ");
			}
			result.append(current.getNumber());
			current = current.getNext();
		}
		return result.toString();
	}

	

}
