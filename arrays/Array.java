package java_codes.arrays;

public class Array {

	public static void main(String[] args) {
		//IN ARRAY: ARRAY IS A LINEAR DATASTRUCTURE WHICH IS USED TO STORE ELEMENTS HAVING 
		 //            SAME DATATYPES
		//           THAT IS LINEAR HOMOGENEOUS DATATYPES 
		// ARRAY INDEX START FROM 0 AND COUNT START FROM 1
		// WHOLE ARRAY STORED IN NUMS KEYWORD IT STORE MORE THAN ONE DTATTYPES IN ARRAY.
		//  SYNTAX OF ARRAY:
		//             int [] variable = new int[size];
		int [ ]  nums = new int [5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		nums[3]=40;
		nums[4]=50;
		System.out.println(nums[2]*10);
		
		
		char [] chars = new char[3];
		chars[0]='a';
		chars[1]='b';
		chars[2]='c';
		
		System.out.println(chars[2]);
		
		int [] even = {10,10,20,30};
		System.out.println(even[3]);
	    
		char [ ] ch = {'a','b','c','d'};
		System.out.println(ch[3]);
		
		
		
		 
	//	int [] sum; = {10,20,30,40};
		
		for (int i=0;i<100;i++) 
		{
			int [] print = new int [i];
			System.out.println(print.length);
           	System.out.print("**********");
			
			System.out.println(i);
			
			
		}
		
		
		int [] num= {10,20,30,40,50,60};
		     int a =0;
		     
		     while (a<num.length)
		     {
		    	 System.out.println(a);
		    	 a++;
		     }
		     
		     
		     
		     
		   int [] anan = {10,20,30,40,50,60};
		         
		   do {
			 System.out.println("anand");
			 
			 
		   }
		   while (10<anan.length);

	}

}
