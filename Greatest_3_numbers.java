package Basics;

import java.util.Scanner;

public class Compare_three {

	public static void main(String[] args) {
						
				Scanner input = new Scanner(System.in);
				System.out.println("Enter Fisrt Number");
				int a = input.nextInt();
				System.out.println("Enter Second Number");
				int b = input.nextInt();
				System.out.println("Enter Second Number");
				int c = input.nextInt();
				
				if(a>b)
				{
					if(a>c)
					{
						System.out.println("The greatest number is: "+a);
					}
					else if(c>a)
					{
						System.out.println("The greatest number is: "+c);
						
					}
					else
					{
					 System.out.println(a+" and "+c+" both are equal");
					 
					}
				}
				else if(b>a)
				{
					System.out.println("The greatest number is: "+b);
				}
				else
				{
					System.out.println(b+" and "+a+" both are equal");
				}
			}
	}

  
  Result:-
  
Enter Fisrt Number
23
Enter Second Number
32
Enter Second Number
24
The greatest number is: 32
