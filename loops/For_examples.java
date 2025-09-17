 package java_codes.loops;

public class For_examples {

	public static void main(String[] args) {
		
		
	//TABLE 1 TO 10
		for (int i=0;i<=10;i++)
		{
			for (int mul=1; mul<=10;mul++)
			{
				System.out.println(i*mul);
			}
		}
		
		int num=47;
		for (int mul=1;mul<=10;mul++)
		{                                       //TABLE OF 47
			System.out.println(num*mul);
		}
		
		
		int anan=0;
		for(int n=1;n<=10;n++)
		{
			anan=anan+n;
			
		}
		System.out.println(anan);
	}

}
