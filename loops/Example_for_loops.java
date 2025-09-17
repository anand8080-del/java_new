package java_codes.loops;

public class Example_for_loops {

	public static void main(String[] args) {
		double sum=0;
		for (double  num=1.0;num<=100.0;num++)
		{
			if(num%13.5==0)
			{
				System.out.println("DIVIDE BY :"+num);
				sum=sum+num;
				
				System.out.println("**********");
				//System.out.println(sum);
			}
			else 
			{
				System.out.println("NOT DIVIDE BY 13.5"+num);
			}
			
			
		}
		
		int add=1;
		for (int i=1;i<=50;i++)
		{
			for (int mult=1;mult<=10;mult++)
			{
				
				System.out.println(i*mult);
			}
		}
		
		
		int summ=0;
		for (int i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("its EVEN:"+i);
			}
			
			else 
			{
				System.out.println("its NOT Even:"+i);
			}
		}
	}
	

}
