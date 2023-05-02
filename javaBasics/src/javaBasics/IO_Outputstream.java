package javaBasics;

	import java.io.FileOutputStream;
	import java.io.IOException;
    import java.util.Scanner;

	public class IO_Outputstream{
		
		public static void main(String[] args) {
			
			FileOutputStream fos=null;
			try {
				Scanner sc = new Scanner (System.in);
				System.out.println ("Enter your name: ");
				String data = sc.next();
				fos = new FileOutputStream("C:\\Selenium\\"+data+".txt");
				System.out.println("File created...");
				
                
				System.out.println ("Enter your email id: ");
				String data1 = sc.next();
				String str = data + "\n " +data1;
				byte b1[] = str.getBytes();
				
				fos.write(b1);
				System.out.println("Data written...");
			
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			finally {
				try {
					fos.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
			
			
			
		}
	}

	

