package java_codes;

public class Method_calling {
	
	public void m1()
	{
		int a = 10;
		int b = 100;
		System.out.println(a+b);
		
	}
	public void m2(){
		float sal = 32.02f;
		int pf = 1221;
		System.out.println(sal * pf);
			
	}

	public static void main(String[] args) {
		System.out.println("these code shows cocept of method calling");
		
		Method_calling x=new Method_calling();
		   x.m1();
		   x.m2();
		   
		
		

	}

}
