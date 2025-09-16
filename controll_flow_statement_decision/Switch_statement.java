package java_codes.controll_flow_statement_decision;

public class Switch_statement {
 public static void main(String argd[]) {
	 int day=2;
	 switch (day) {
	 case 0:
		 System.out.println("sunday");
		 break;
		 
	 case 1:
		 System.out.println("monday");
		 break;
		 
	 case 2:
		 System.out.println("tuesday");
        break;
	 case 3:
		 
		 System.out.println("wednseday");
		 break;
		 
		 default:
			 System.out.println("invalid day");
	 
	 }
 }
}

//switch,case,break are keywords and day,0,1,2 are variables
// it checks conditions up to the true 
// break is used for end the case 
// all conditions are false that time default execute it works like a else in switch
//multiple cases are use in switch
// to get the true value it cannot check next condition






