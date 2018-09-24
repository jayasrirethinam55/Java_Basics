package Basics;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = obj.nextDouble();
        
        if(salary >0 && salary<=10000)
        {
          double  bonus = 0.2;
          salary = salary+bonus*salary;
          System.out.println(salary);
        }
        if(salary==10000)
        {

            double  bonus = 0.25;
            salary = salary+bonus*salary;
            System.out.println(salary);  
        }
        if(salary>10000)
        {
          double  bonus = 0.3;
          salary = salary+bonus*salary;
          System.out.println(salary);  
        }
	}

}


Result:-

Enter your salary
1200
1440.0

