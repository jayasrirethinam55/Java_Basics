package Basics;

import java.util.Scanner;

public class Compare_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Fisrt Number");
		int first = input.nextInt();
		System.out.println("Enter Second Number");
		int sec = input.nextInt();
		if(first>sec)
		{
		  System.out.println("Fisrt is greater");
		}
		else if(sec>first)
		{
			System.out.println("Second is greater");
		}
		else
		{
			System.out.println("Both are same");
		}
	
	}

}




Result:-
Enter Fisrt Number
23
Enter Second Number
32
Second is greater
