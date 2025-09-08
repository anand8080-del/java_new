package java_codes;

public class Revision_codes {
	public static void main(String args[])
	{
		
		int [] pay=new int[5];
		pay[0]=5000;
		pay[1]=2000;
		pay[2]=20000;
		pay[3]=55210;
		pay[4]=564132;
		System.out.println("payment of anand first :"+pay[0]);
		System.out.println("payment of anand second :"+pay[1]);
		System.out.println("payment of anand third :"+pay[2]);
		System.out.println("payment of anand fourth :"+pay[3]);
		System.out.println(pay.length);
		
		
		
		String latter="ananannananananan";
		System.out.println(latter.length());
		String [] arr = new String[3];
		arr[0]=" software developer_";
		arr[1]="is a data analytics";
		arr[2]=" data scientist";
		System.out.println(arr[0].length());
		System.out.println(arr[1].length());
		System.out.println(arr[2].length());
	   System.out.println("it is a"+arr[0]);
		//special case in java
	   System.out.println(pay[0]+pay[1]+arr[0]);
	   //jvm moves from up to down and left to right becouse of this perform first mathematical operation 
	   //after the string he cannot perform mathematical operations.
		System.out.println(arr[0]+pay[1]+pay[0]);
		//jvm moves left to right after the string they cannot perform mathematical operations.
		
		// NAROWWING OR EXPLICIT TYPE CASTING
		long cal= 1111111111;       
		short an = (short) cal;     //DATA LOSS
		System.out.println(an);
		
		// WINDING OR IMPLICIT TYPE CASTING
		int ana =100000;
		long as = ana;
		long na = (int) ana;
		System.out.println(ana);     // NO DATA LOSS
		System.out.println(as);
		
		
		
	//INCREMENT OR DECREMENT OPERETOR IN JAVA 
   //PRE AND POST --//--  
		
		//PROGRAM : COBINATION OF BOTH
	
		int i=10;
		i++; // 10=>11
		++i;  //12
		--i;    //11
		i--;     //11=>10
		i++;     //10=>11
		System.out.println((i++)+(++i)+i+(i++)-(--i)+(i--)+(i++));
		                   //11
		
		
		
		
		
		
		
		
	}

}
