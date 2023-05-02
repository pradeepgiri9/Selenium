package javaBasics;

	class Emp
	{
		int id;
		String name;
		String email;
		
		Emp()
		{
			System.out.println("const calling....");
		}	
		
		Emp(int a, String b, String c)
		{
			id = a;
			name=b;
			email = c;
		}
		
		public void display()
		{
			System.out.println(id+" "+name+" "+email);
		}
	}

	public class Practice2 
	{
		public static void main(String[] args) {
			
			Emp e1 = new Emp(10,"xyz","xyz@gmail.com");
			e1.display();
			
			Emp e2 = new Emp(20,"abc","abc@gmail.com");
			e2.display();
			
			
			
			
		}
	}

