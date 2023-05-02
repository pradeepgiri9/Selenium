package javaBasics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class IO_Inputstream  {
		public static void main(String[] args) {
			
			FileInputStream fis = null;
			
			try {
				Scanner sc = new Scanner (System.in);
				System.out.println ("Enter your name: ");
				String data = sc.next();
				fis = new FileInputStream("C:\\Selenium\\"+data+".txt");
		
				int  i =  fis.read();
				
				while(i!=-1)
				{
					char c = (char) i;
					System.out.print(c);
					i = fis.read();
					
				}
					
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}
	

