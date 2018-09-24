package Jaya;

import java.util.Scanner;

public class largest3number {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a first value");
	int a=sc.nextInt();
	System.out.println("enter a second value");
	int b=sc.nextInt();
	System.out.println("enter a third value");
	int c=sc.nextInt();
	if (a>b && a>c)
	{
		System.out.println("Greater"+a);
	}
	else if (b>c)
	{
         System.out.println("Greater"+b);
	}
   }

}

Result:

enter a first value
12
enter a second value
23
enter a third value
14
Greater23

