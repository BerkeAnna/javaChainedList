package hu.ak.linkedList_DoublyLinkedListReal;

import hu.ak.linkedList_DoublyLinkedListReal.Link;

public class DoublyLinkedListReal {

	protected Link first = new Link(true);
	protected Link last = new Link(true);
	
	
	public DoublyLinkedListReal() {
		first.setNext(last);
		last.setPrevious(first);
	}

	public boolean contains(int number) {
		Link current = first.getNext();
		while(!current.isBound() ) {
			if( current.getValue() == number) {
				return true;
			}
			current= current.getNext();
		}
		return false;
	}
	//lista elejére akarjuk beláncolni
	public boolean add(int number)
	{
		boolean isAlreadyInList = contains(number);
		Link newLink = new Link(number);
		newLink.setPrevious(first);
		newLink.setNext(first.getNext());
		first.getNext().setPrevious(newLink);
		first.setNext(newLink);
		return !isAlreadyInList;
		
	
	}
	
	
	public void deleteAll(int number) {
		Link current = first.getNext();
		while(!current.isBound()) {
			if(current.getValue() == number) {
				Link previous = current.getPrevious();
				Link next = current.getNext();
				previous.setNext(next);
				next.setPrevious(previous);
			}
			current = current.getNext();
		}
			
	}
	
	
	public String getElementsAsString()
	{
		StringBuilder stringRepresenataion = new StringBuilder();
		Link current = last.getPrevious();
		while(!current.isBound()) {
			if(current != last.getPrevious()) {
				stringRepresenataion.append(" - ");
			}
			stringRepresenataion.append(current.getValue());
			current = current.getPrevious();			
		}
		return stringRepresenataion.toString();
	
	}

}
