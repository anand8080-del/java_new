package java_codes;

public class Non_primitive_datatypes {

	public static void main(String[] args) {
		//1) Array
	// Array is the collection of dataTypes
		//Array is the linear and homogeneous: when you have to assign the length then data assigned side by side or adjusent
		//length index start from the 0
		// 5 : length is five but index start with 0
		//variable.length: .length give the length of an array
		//null value accessed in all non primitive dataTypes
		
		int [] salary=new int[4];
		System.out.println(salary.length);
		//NEW it helps to create new Array. it also known as object or instance
		salary[0]=10000;
		salary[1]=20000;
		salary[2]=10000;
		salary[3]=20000;
		System.out.println("salary value is:"+ salary[3]);
		//2) String
		// string is the collection of letters or characters
		//string is not perform mathematical operations
		
		String name="hbdxesgdyuxgdwfdyuqwixsifdyi";
		System.out.println(name.length());
		String []str=new String[3];
		str[0]="anand";
		str[1]="samadhan";
		str[2]="tejas";
		System.out.println("Name is:"+str[0]);
		System.out.println(str[0].length());
		System.out.println(str[1].length());
		//string is method because of this () is used
		//these () is used in string for check length
		
		
		int [] anand=new int [5];
		anand[0]=20000;
		anand[1]=5655;
		anand[2]=9878;
		anand[3]=86765;
		anand[4]=65444;
		System.err.println(anand.length);
		System.out.println("anand salary is"+anand[0]);
		
		
		
		
		
		
		
		
		

	}

}
