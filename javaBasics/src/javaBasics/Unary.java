package javaBasics;

public class Unary {
	  public static void main(String[] args) {
	    int x = 5;
	    int y = ++x;
	    System.out.println(y);
	    System.out.println(++y + y++ + --y + y++);
	    System.out.println(y);
	  }
}
