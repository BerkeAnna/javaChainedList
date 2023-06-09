package hu.ak.linkedList_remove;

import hu.ak.linkedList_remove.LinkedList;

public class LinkedList {
	
	public Link first;
	
	public boolean contains(int number) {
		Link current = first;
		while(current  != null) {
			if(current.getNumber() ==number ) {
				return true;
			}
			current= current.getNext();
		}
		return false;
	}
	
	public boolean simpleAddBackwards(int number)
	{
		boolean alreadyExists = contains(number);
		if(first == null) {
			first = new Link(number);
		}else {
		
				Link newLink = new Link(number);
				Link second = first;
				first = newLink;
				first.setNext(second);
			
		}
		return alreadyExists;
	}
	
	public void deleteFirst(int number) {
		Link current = first;
		Link previous = current;
		while(current.getNext() != null) {
			if(current.getNumber() == number) {
				if(current == first) {
					first = current.getNext();
				}else {
					previous.setNext(current.getNext());
				}
				break;
			}
			previous = current;
			current = current.getNext();
			
		}
			
	}
	
	public void deleteAll(int number) {
		Link current = first;
		Link previous = current;
		while(current.getNext() != null) {
			if(current.getNumber() == number) {
				if(current == first) {
					first = current.getNext();
				}else {
					previous.setNext(current.getNext());
				}
			}
			previous = current;
			current = current.getNext();
			
		}
			
	}
	
	
	public String getElementsAsString()
	{
		StringBuilder result = new StringBuilder();
		Link current = first;
		while(current != null) {
			result.append(current.getNumber());
			if(current.getNext() != null) {
			result.append(" - ");
			}
			current = current.getNext();
		}
		return result.toString();
	}

	

}
