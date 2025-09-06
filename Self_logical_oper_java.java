package java_codes;

public class Self_logical_oper_java {
	public static void main(String[] args) {
		/**
		 * && used for check conditions
		 * first condition is false then second condition not check
		 -in logial &&(and) operator it gives output in the form of true or false
		 -in output any condition false then output will be false 		 
		 -both conditions are true then it gives true output otherwise false
		 - &(bitwise AND): work with numbers or integers and it give boolean output of integers
		    it cannot work with float & double.
		    it works with(byte,short,int,long,char)
		 * */
		 
		int age=30;
		float pj=10f;
		double sal=40000;
		System.out.println(age>=10 && sal>=30000);
		
		System.out.println( age>=10 && sal>=30000);
		if (age>=31 && pj<=8.20)
		{
			System.out.println("experinced employee");
			System.out.println("hired");
				
		}
		else {
			System.out.println("these employee is fresher");
			System.out.println("thise type of employee take four round compulsary");
			
			
			int a =5;
			int b=3;
			System.out.println(a & b);
			
		}
		//OR operator:
		/**
		  it is also conditional operator 
		  first operator is true then output true otherwise it false
		  at least one operator is true otherwise false
		  first condition is true then next condition skip
		 */
		int a = 10;
		int b= 20;
		System.out.println(a>=5 || b<=19);
		if (a>=11 || b>=33) {
			
			System.out.println("excellent student");
			
		}
		else {
			
			System.out.println("poor student");
		}
		
		/**
		 NOT OPERATOR
		 it is denoted by "!"
		 it  true convert into false
		     false convert into true
		 */
		
		int d= 10000;
		short e=22;
		System.out.println(!(d>=11000 && e<=21));
		
		
		
		
		
		
		}
		


}
