package java_codes.arrays;

public class Array7_reverse {

	public static void main(String[] args) {
		int [ ] arr = {1,2,3,4,5,6};
		int n=arr.length;
		
		for (int i =0;i<n;i++) {
			
			System.out.println("STRAIGHT ARRAY IS:"+arr[i]);
		}
		 System.out.println("********");
		 
		 for (int i = n-1;i>=0;i--) {     
			                            //6-1=n=5 then 5>0 =>o/p:6 
			                           // 5-1=n=4 then 4>0 =>o/p:5 
			 
			 System.out.println("REVERSE NUMBER IS:"+arr[i]);
		 }

		// PROGRAM OF REVERSE NUMBER WITH SWAPPING NUMBERS AND REDUCE TIME AND SPACE COMPLEXITY 
		 
		 int [] arr1 = {10,20,30,50,80,55};
		 
		 for (int i=0;i<arr1.length;i++) {
			 
			 System.out.println("STRAIGHT OUTPUT IS :"+arr1[i]);
		 }
		 
		 int start=0;
		 int end=arr1.length-1;
		 
		 while (start<=end ) {       // 0.......5
			 int temp = arr1[start];      //10 , 10=55, 55=temp
			  arr1[start] = arr1[end];
			 arr1[end]=temp;
			 
			 start++;
			 end--;
		 }
		 System.out.println("************");
		 for (int i=0;i<arr1.length;i++) {
			 System.out.println("REVERSE NUMBER IS :"+arr1[i]);
		 }
	}

}
