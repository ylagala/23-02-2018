package Arrays;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		long result = 0;
		long temp = 0;
		int power = 0;
 
       boolean isABinNumber = String.valueOf(input).matches("^[01]+$");
    	
      
		if(input == 0){
			result = 0;
			System.out.println(result);
		}else if(input < 0){
			System.out.println("Incorrect input");
		}
		else if(!isABinNumber){
			System.out.println("Not a Binary Number");
		}
		else{
		while(input > 0){
			temp =  input % 10;
			result = result + (temp * ((int) Math.pow(2, power)) );
		    input = input /10 ;
			power++;
		}
		System.out.println(result);
		}
        
		
		sc.close();

	}

}
