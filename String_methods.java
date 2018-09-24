package String1;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String S ="Payilagam";
		
			
			System.out.println(S.length());//9
			System.out.println(S.charAt(1));//a
			System.out.println(S.concat(" institute"));
			//Payilagam institute
			System.out.println(S);//Payilagam
			
			System.out.println(S.contains("a"));//true
			System.out.println(S.endsWith("m"));//true
            System.out.println(S.startsWith("P"));//true
            System.out.println(S.trim());//Payilagam
            System.out.println(S.substring(3));//ilagam
		    System.out.println(S.substring(2,7));//yilag
		    System.out.println(S.indexOf("i"));//3
		    
		    
		    String s1 = "Java";
		    String s2 = "jAvA";
		    
		    String s3 = new String("Java");
		    String s4 ="Java";
		    		
		    System.out.println (s1.equals(s2));//false
	        System.out.println(s1.equalsIgnoreCase(s2));//true
	        System.out.println(s1.equals(s3));//true
	        System.out.println(s1.equals(s4));//true
	        
       }		

	}


