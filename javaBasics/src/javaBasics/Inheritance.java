package javaBasics;

class NoteBook //parent, super, base
{
	int price;
	String company;
	String color;
	
	public void display()
	{
		System.out.println(price+" "+company+" "+color);
	}
}

class Pen1 extends NoteBook //child, sub, derived
{
	
	public void toWrite()
	{
		System.out.println(price+" "+company+" "+color);
	}
}

public class Inheritance {
	public static void main(String[] args) {
		
		NoteBook book = new NoteBook();
		book.price=20;
		book.display();
		
		Pen1 p = new Pen1();
		p.price=50;
		p.display();
		
	}
}


