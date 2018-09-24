package Guhan;
import java.util.Scanner;
public class GetStringValue {

	public static void main(String[] args)  {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Give Instructions");
		
		String ins = obj.next();
		
		if( ins.equals("ON"))
		{
			System.out.println("LED IS ON");
		}
		else if(ins.equals("RUN"))
		{
			System.out.println("LED IS RUNNING");
		}
		else if(ins.equalsIgnoreCase("Guhan"))
		{
			System.out.println("His name is Guhan");
		}
		else
		{
			System.out.println("LED IS OFF");
		}
		
		/*
		char c = (char) System.in.read();
		
		if(c=='A')
		{
			
		}
		
		*/
		

	}

	

}

Result:-

Give Instructions
ON
LED IS ON
