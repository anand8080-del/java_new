package java_codes.loops;
import java.util.*;


public class User_input_loops {

	public static void main(String[] args) {
        
     /**   Scanner sc = new Scanner(System.in);
          int range = sc.nextInt();
           int n = 1;
           while (n<=range)
           {
        	   
        	   
        	   System.out.println(n);
        	   n++;
           }
           
           
        */   
           
           Scanner sc = new Scanner(System.in);
           int anan = sc.nextInt();
           int sum =0;
           int i =1;
           while (i<=anan)
           {
        	   
        	   sum=sum+i;
        	   i++;
        	   
           }
           System.out.println(sum);
           
	}

}
