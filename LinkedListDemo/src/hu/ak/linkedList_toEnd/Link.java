package hu.ak.linkedList_toEnd;

public class Link {
	
	//amit el akarunk tárolni, amit a felhasználó megad
	private int value;
	
	//memóriacím, hogy hol található a következő láncszem
	//önmagára mutat - tartalmazási viszony
	//null-ra inicializálódik
	private Link next;


	public Link(int number) {
		this.value = number;
	}



	public int getValue() {
		return value;
	}

	public Link getNext() {
		return next;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	
	
}
