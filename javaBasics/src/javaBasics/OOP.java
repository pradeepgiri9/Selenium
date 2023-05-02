package javaBasics;

class Calculation {
	
//method manipulation
	
		public void display()
		{
			System.out.println("Running display...");
		}
		
		public void add(int a, int b)
		{
			System.out.println(a+b);
		}
		
		public int square(int a)
		{
			//int sq = a*a;
			return a*a;
		}
		
		public String myName()
		{
			String name = "test";
			return name;
		}
		
		public void addArray(int a[])
		{
			int sum = 0;
			for(int i=0;i<a.length;i++)
			{
				sum = sum+a[i];
			}
			System.out.println("sum is : "+sum);
		}
		
		public int[] reverseArray(int a[])
		{
			//a = {10,20,30}
			//b = {30,20,10}
			int b[] = new int[a.length];
			
//			b[0] = a[2];
//			b[1] = a[1];
//			b[2] = a[0];
			
			int k = 0;
			for(int i=a.length-1;i>=0;i--)
			{
				b[k] = a[i];
				k++;
			}
			
			return b;
		}
		
		
		
	}

	public class OOP{
		public static void main(String[] args) {
			
			Calculation c = new Calculation();
			c.display();
			c.add(10,20);
			c.add(50, 60);
			int sq =  c.square(10);
			System.out.println("Square is : "+sq);
			String name = c.myName();
			System.out.println("My name is : "+name);
			
			int a[] = {10,20,30,40,50};
			c.addArray(a);
			int b[] = {1,2,3,4,5,6};
			c.addArray(b);
			
			int k[] =  c.reverseArray(b);
			
			for(int i=0;i<k.length;i++)
			{
				System.out.println(k[i]);
			}
			
			
		}

	}
	

