package java_codes.loops;

public class While_loop {

	public static void main(String[] args) {
		//no of iteration does not know at that time used
		//its also follow ICBO initialization=condition=block=operation
		//EX1)
		
		int num=10;
		while (num<100)
		{
			System.out.println(num);
			num++;
		}
		// at that time your code false at that time code stop...
		//if your condition cant false its give again and again o/p...
            int sum=19;// initialize
            while (sum<=1000)    // condition
            {
            	if (sum%10==0)
            	{
            		
            		System.out.println("divisible by 10"+sum);
            	}
            	
            	else {
            		
            		System.out.println("not divisible by 10"+sum);
            	}
            	sum++;
            }
        
           
            int a=1;
            while(a <= 10)
            {
            	//a++;             //1=> 2 becouse before for know a=2.
            	for (int i=1;i<=10;i++)
            	{
            		System.out.println(a*i);
            		
                	
            	}
            	System.out.println("*********");  
            	a++;            // starts from 1
            }
            
            
            
	
	}

}
