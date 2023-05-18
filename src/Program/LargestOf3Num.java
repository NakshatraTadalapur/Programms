package Program;

import java.util.Scanner;

public class LargestOf3Num {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first num:");
		int a = sc.nextInt();
		
		System.out.println("enter the second num:");
		int b = sc.nextInt();
		
		System.out.println("enter the third num:");
		int c = sc.nextInt();
		
	// using
		
	/*	if(a>b && a>c)
		{
			System.out.println(a+"is largest num");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+"is largest num");
		}
		else
		{
			System.out.println(c+"is largest num");
		}
     */
	// using ternary operator
		int largest1=a>b ? a:b;
		int largest2=c>largest1 ? c:largest1;
		
		System.out.println(largest2+"is the largest number");
		


	}

}
