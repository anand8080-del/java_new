package java_codes.arrays;


public class Array2 {

	public static void main(String[] args) {
	 int [] arr= {11,13,34,32,12,67,66,-3,-44,-7};
	 int  num =0;
	 int second=0;
	 int third =0;
	 int fourth=0;
	 for (int i=0;i<arr.length;i++) {
		 
		 if (arr[i]>num) {
			 
			 second = num;  //    34
			 
			 num=arr[i];    //     67
			 
		 }
		
		 if (arr[i]>second  && arr[i]<num)    //11>65,13>65,34>65,65>65,32>65...67>65
		                                              
			 
		 {
			 third =second;           //34
			 second = arr[i];         //66
		 }
		 
		 if (arr[i]>third  && arr[i]<second ) {
			 
			 
			 fourth = third;
			 third = arr[i];
		 }
		 if(arr[i]>fourth && arr[i]<third) {
			 
			  fourth = arr[i];
		 }
		 
		
	 }
	 System.out.println("HIGHEST FOURTH NUMBER IS :"+ fourth);
	 System.out.println("HIGHEST THIRD NUMBER:"+third);
	 System.out.println("SECOND HIGHEST NUMBER IS "+second);
	 System.out.println("HIGHEST NUMBER IS "+num);

	}

}
