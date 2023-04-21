package hu.ak.linkedList_Ordered;

import hu.ak.linkedList_Ordered.OrderedLinkedList;

public class OrderedLinkedList {
	
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
	
	public boolean add(int number)
	{
		boolean alreadyExists = contains(number);
		Link insertionPoint = first;
		Link previous = first;
		
		while(insertionPoint != null && insertionPoint.getNumber() < number) {
			previous = insertionPoint;
			insertionPoint = insertionPoint.getNext();
		}
		Link newLink = new Link(number);
		if(insertionPoint == first) {
			newLink.setNext(first);
			first = newLink;
		} else {
			previous.setNext(newLink);
			newLink.setNext(insertionPoint);
		}
		
		return !alreadyExists;
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
			}else {
				previous = current;
			}
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
