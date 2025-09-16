package java_codes.controll_flow_statement_decision;

public class If_else_statement {

	public static void main(String[] args) {
		int age = 35;
		int sal = 2000;
		
		if(age>=36 && sal<=10000)
		{
			System.out.println("it is new employee:");
		
		}
		
		else {
			System.out.println("it is not a employee");
		
			}
		
		
		int marks=90;
		float atten=75.55f;
		short insame_marks=100;
		if (marks>=80 && atten>=75 || insame_marks>90)
		{
			System.out.println("give A+ grade for practical");
			System.out.println("above 45 marks");
		} 
		
		else 
		{
			
			System.out.println("give B grade for practcal");
			
		}
	}

}
//first condition is true then execute code  it cannot goes through  next condition
//if first condition is false at that time only goes to else condition.