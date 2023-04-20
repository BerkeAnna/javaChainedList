package hu.ak.linkedList_toEnd;

public class LinkedList {
	
	//lánszem objektum, itt Link.
	//az első láncszemre mutató memóriacímet fogja tárolni
	//ha nem adok neki semmit, akkor alapból null lesz (ami jó)
	private Link first;

	public void add(int number) {
		if(first == null)
		{
			//a 17-esnek a memóriacímét fogja tárolni a first
			first = new Link(number);
		}else {
			//el kell menni a lánc végéig, a legutolsó láncszemhez, és oda kell az újat láncolni	
			Link newLink = new Link(number);
			Link current = first;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newLink);
		}
		
	}

	public void print() {
		Link current = first;
		while (current != null) {
			System.out.println(current.getValue());
			System.out.println(first.getValue());
			current = current.getNext();
		}
		
	}

}
