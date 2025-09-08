package java_codes;

public class Arithmatic_operators_with_its_types {
	public static void main(String[] args) {
		/*there are two types of arithmetic operators 
		//1) increment operators
		// in the increment operator there are two types pre-increment and post-increment
		//---post increment--- i++ first give the output i then compiler add ++
	      ---pre increment--- ++i  first jvm perform addition and then give o/p
		in increment number increased by addition of one
		
		
		*/
		int sal=10;
		sal++; //10=>11
		sal++; //11=>12
		sal++; //12=>13
		System.out.println(sal+(sal++)+(++sal));
		                  //13+13+15=>15
		
		System.out.println(sal);
		
		
		
		int i =1;
		i++;
		++i;
		i++;
		i++;
		System.out.println(i+(i++)+(++i)+(i++)+(i++)+(++i)+(++i));
		                  //5+5+7+7+8+10+11
		System.out.println(5+5+7+7+8+10+11);
		System.out.println(i);
		
		
		
		//decrement operators
		//its also two types pre-decrement and post-decrement
		//same as increment but in opposite
		//---pre decrement---: --i
		//---post decrement---: i--
		
		
		int age=12;
		age--; //12=>11
		++age; //12
		age--; //12=>11
		--age; //10
		--age; //9
		System.out.println(age+(age--)+(--age)-(--age)+(age++));
		                   //9+9+7-6+6
		System.out.println(9+9+7-6+6 );
		System.out.println(age);
		
		double pay = 105.11;
		++pay; //106.11
		--pay; //105.11
		pay++; //105.11=>106.11
		pay--; //106.11=>105.11
		System.out.println((pay--)-(pay++)+pay+(--pay)+(++pay));
		                  //105.11-104.11+105.11+104.11+105.11
		System.out.println(105.11-104.11+105.11+104.11+105.11);
		System.out.println(pay);
		
           //REMAINING ARITHMATIC OPERATORS
	         //  +,-,% OR /
	// these operator follows BODMAS rule
	// % it gives a reminder between integers
		
		
		int a=10;
	      
		int b =20;
		
		
		System.out.println(b%a);
		// when an divison properly then its give output 0
		System.out.println((1+11)-15/5);
		System.out.println(10%3);
		System.out.println(10%2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
