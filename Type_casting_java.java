package java_codes;

public class Type_casting_java {
	public static void main(String args[])
	  {
		  
		  	//type casting
		  	//two types of casting narrowing/explicit or winding/implicit
		  	//1)explicit casting 
		  	//in these method large data converted into small data at that time some amount of data loss
		//large data put in small space or small range dataType thats why data loss occurred.
		  	double salary=333.222;
		  	int anand = (int)salary;
		  	//(int) it is also known as casting 
		  	System.out.println(anand);
		  	
		       // 2) winding/implicit casting:
		  	//in these method small data put in large storage or data  and no data loss occurred
		  	int a=555;
		  	double b= a;
		  	System.out.println(b);
	  
	  }


}
