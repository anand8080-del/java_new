package java_codes;

public class Relational_operator {

	public static void main(String[] args) {
		//its give the relation between two numbers like grater or small
        // < > == >= <= != these is also known as relational operators
		// == it is the relational operator it gives output in the form of true or false
		//it checks the value of variable/identifier in primitive dataTypes
		// it checks the references in non primitive dataTypes
		
		int a=10;
		int b=200;
		System.out.println(a==b);
		// these a and b is variables in primitive dataTypes
		
		
		String [] str1= new String[1];
		str1[0]="anand";
		String [] str2= new String[1];
		str2[0]= "anand";
		System.out.println(str1[0]==str2[0]);
		
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a==b);
		
	
	}

}
