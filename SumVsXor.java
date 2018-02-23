package Arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class SumVsXor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        long n = in.nextLong();
              
        long xor = 0;
        long add = 0;
        long count =0;
      
        for(long i=0; i<n; i++){
            xor = n^i;
            add = n+i;
            if(add == xor){
               count++;
            }
        }
        System.out.println(count);
        }
	

}
