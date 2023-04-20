package hu.ak.linkedList_toStart;

public class LinkedList {
	
	public Link first;
	
	public void add(int number)
	{
		if(first == null) {
			first = new Link(number);
		}else {
			Link newLink = new Link(number);
			Link second = first;
			first = newLink;
			fisrt.setNext(second);
			
		}
	}
	
	public void print()
	{
		Link current = first;
		while(current != null) {
			System.out.println( current.getNumber());
			current = current.getNext();
		}
	}
	

}
