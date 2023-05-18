package Program;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int numb=s.nextInt();
		
		String result;
		
		result= numb%2==0? "even" : "odd" ;
		
		System.out.println(result);
	 
	}

}
