package java_codes.controll_flow_statement_decision;

public class If_else_if_ladder {

	public static void main(String[] args) {
	// 1) EXAMPLE
		int marks=96;
		String grade="ab";
		
		if(marks<80 && grade=="ab")
		{
			
		System.out.println("toper");	
		}
		else if(marks<95 || grade=="bc")
		{
			System.out.println("not be a topper");
			
		}
		
		else if (marks>=95 || grade=="ab")
		{
			
	      System.out.println("first topper");
			
		}
		
		
		else 
		{
			System.out.println("average student");
			
			
		}
		
		//2)EXAMPLE
		
		int num = 12;
		if(num>0)
		{
			System.out.println("positive number");
		}
		else if(marks<0)
		{
			System.out.println("number is negative");
		}
		
		else {
			System.out.println("num is 0");
		}
		
		
		
		// 3)EXAMPLE
		double attendance=76;
		if(attendance>=35 && attendance<=45)
		{
			System.out.println("3rd class student");
		}
		else if (attendance>45 && attendance<=60)
		{
			System.out.println("2nd class student");
		}
		else if(attendance >60 && attendance<=75)
		{
			System.out.println("1st class student");
		}
		else  if (attendance >75 && attendance<=100)
		{
			
			System.out.println("distinction");
		}
		else 
		{
			
			System.out.println("failled");
		}
		//4)EXAMPLE
		double price =11000;
		if (price>5000 && price<=7000)
		{
			System.out.println("5% discount");
			double discount = 11000 * 0.05;
			double total_price = price - discount;
			System.out.println(total_price);
		}
		else if(price>7000 && price <=11000)
		{
			
			System.out.println("10% discount");
			double discount = price * 0.10;
			double total_price = price - discount;
			System.out.println(total_price);
			
		}
		else {
			
			System.out.println("NO DISCOUNT");
		}
		
		}
		
	}


     // LADDER STATEMENT USE FOR APPLY MULTIPLE CONDITIONS
     //if first condition is true then execute the program when an first condition is false at that time check next condition
    // next condition is also false then check again next condition these process continuous...
    // all conditions are false then else condition is execute 


