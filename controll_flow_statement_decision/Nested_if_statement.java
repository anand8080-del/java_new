package java_codes.controll_flow_statement_decision;

public class Nested_if_statement {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if (a>5 && b<22)
		{
			if (a<20 || b>200)
			{
				
				if (a<=10 || b>=21)
				{
					
					System.out.println("these is a nested statement");
				}
				else {
					
					System.out.println("no nested");
				}
				
			}
		}
		
		int d=10;
		int e =20;
		if (d>5 && e<10)
		{ 
			 if (a>5 || b>5)
			
			System.out.println("good");
		}
		
		else 
		{
			
			System.out.println("bad");
		}
		
	}

}

// in nested_if conditions apply on inside the conditions 
//in single if condition put multiple if conditions
// if all conditions are true at that time only give the output otherwise print else

