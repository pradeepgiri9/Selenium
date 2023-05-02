package javaBasics;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
	
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		
//		Scanner sc = new Scanner (System.in);
//		System.out.println("enter value of d: ");
//		int d = sc.nextInt();
//		int e = a+b+c+d;
//		System.out.println(e);
		
		int k;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of k : ");
		k = sc.nextInt();
		int sum=0;
		for(int i=1;i<=k;i++)
		{
			sum = sum + i;
		}
		
		System.out.println("sum is : "+sum);
		
		}while(k!=0);
		
		
	}
	
}
