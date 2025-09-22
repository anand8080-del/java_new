package java_codes.arrays;

public class Array1 {

	public static void main(String[] args) {
		//#1)PROGRAM:
		
				int [] arr= new int[150];
				for (int i=0;i<150;i++)
				{
					arr[i]=i;     //perform mathematical operations like i+2,i*3;
					System.out.println(i);

				}
				
				
				
				
				//#2)PROGRAM:
				
		           int counter=0;
				int [] arr1 = new int [1500];
				
				for (int i=0;i<1500;i++)
				{
					if (i%7==0)
					{
						System.out.println(" "+i);
						
						counter++;
						
					}
					
		                	arr1[i]=i;
					
					
					
					
				}
				
				System.out.println("*********");
				System.out.println("     "+counter);
				
				
				
				
				
				
				//#3)PROGRAM:
				
				int num=0;
				int [] arr3 = {10,20,30,9,4,90,-2,-3,-5564};
				for (int i=0;i<arr3.length;i++)
				{
					
					if (arr3[i]>num)    //num=10; 20>10=>num=20; 30>20=>num=30
						                // 9>30 => condition false if block not be a executed
						                // 90>30 => num=90
					{
						num=arr3[i];
					}
				}
				
				System.out.println("highest number "+num);
				
				
				
				//#4)PROGRAM:
				
				int num1=0;
				int [] arr4= {10,20,2,40,-2,-3,0};
				for (int i=0;i<arr4.length;i++)
				{
					
					if (arr4[i]<0)
					{
						num1=arr4[i];
						
					}
						
				}
				System.out.println("smallest nuber is"+num1);
				
				
				
				//#5)PROGRAM: USING RAPPER CLASS
				
				int [] arrr= {10,20,3,4,5,-3,-5,-9};
				int num3=Integer.MIN_VALUE;
				for (int i=0;i<arrr.length;i++)
				{

		          if (arrr[i]>num3)
		          {
		        	  num3=arrr[i];             //ITS RAPPER CLASS USING MIN_VALUE YOU HAVE TO 
		        	                            // CALCULATE HIGHEST NUMBER:
		        	  
		          }
				}
				
				
				System.out.println(num3);
				
				
				
				
				
				
				//#6)PROGRAM: USING RAPPER CLASS
				
				int [] arrrR= {10,20,3,4,5,-3,-5,-9};
				int num4=Integer.MAX_VALUE;
				for (int i=0;i<arrrR.length;i++)
				{

		          if (arrrR[i]<num3)
		          {
		        	  num4=arrr[i];             //ITS RAPPER CLASS USING MAX_VALUE YOU HAVE TO 
		        	                            // CALCULATE  SMALLEST NUMBER:
		        	  
		          }
				}
				
				
				System.out.println(num4);
				
				
				

	}

}
