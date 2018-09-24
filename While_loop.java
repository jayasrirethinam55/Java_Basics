package Jaya;

public class Whileloop {


public static void main(String[] args) {
	int a=3;
	int b=2;
	int c=1;
	while(a>b || b>c) {
		a=b+c;
		b=a+c;
		c=a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
	
	}
	
}
}


Result:-

3
4
7
