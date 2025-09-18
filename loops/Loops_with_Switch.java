package java_codes.loops;

public class Loops_with_Switch {

	public static void main(String[] args) {
		for (int i=0;i<=10;i++)
		{
			switch(i) 
			{
			
			case 0 :
				System.out.println("1 st number Execute");
				break;
				
			case 1: 
				System.out.println("2nd number is execute");
				break;
				
			case 2: 
				System.out.println("3rd number is execute");
				break;
				
				default :
					System.out.println("invalid data");
					
			}
		}
		
		
		//WHILE INSIDE SWITCH:
		 int num=0;
		 while (num<=10)
		 {
			// System.out.println(num);
			num++;
			 switch (num)
			 {
			 case 1: 
				 System.out.println("execute 1st number");
				 break;
				 
			 case 2:
				 System.out.println("execute 2nd number");
				 break;
				 
			 case 3:
				 System.out.println("execute 3rd number");
				 break;
				 
				 default :
					 System.out.println("invalid number");
			 }
		 }
		 
		 
		 for (int sum=0;sum<=8;sum++) 
		 {
			 switch(sum) {
			 
			 case 0: {
				 
				 if (sum%2==0) {
					 
					 System.out.println("EVEN");
				 }
				 else {
					 System.out.println("NOT EVEN");
				 }
				 break;
			 }
			 
			 
			 case 1: {
				 if(sum%2==0) {
					 System.out.println("ITS ALSO EVEN");
				 }
				 else {
					 System.out.println("ITS NOT BE A EVEN");
				 }
				 break;
			 }
			 default :
				 System.out.println("invalid integer");
				 break;
				 
			 }
		 }
		 
		 // CONTINUE PROGRAMS:
		 
		 for (int j=0;j<=4;j++)
		 {
			 //System.out.println(j);
			 switch (j) {
			 
			 case 0:
				 System.out.println("use contineus statement ");
				 continue;
				 
			 case 1:
				 System.out.println("use break statement");
				   break;
				   
			 case 2 :
				 System.out.println("also use break statement");
				 break;
				 
			 case 3: 
				 System.out.println("also use continue statement ");
				 continue;
				 
				 default:
					 System.out.println("invalid data");
					 
			 }
		 }
		 
		for (int nm =0;nm<=10;nm++) {
			
			if (nm!=5) 
			{
			continue;	
			
			}
			System.out.println(nm);
		} 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
