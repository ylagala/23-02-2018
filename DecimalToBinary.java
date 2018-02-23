package Arrays;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String result = "";
		int temp = 0;
		if(input < 0){
             result = "Cannot Convert Negative Integer to Binary";
		}
		else if(input == 0){
			result = "0";
		}
		else{
		while(input > 0){
			temp = input % 2;
			result = result + temp ;
			input = input/2;
		}
		}
		System.out.println(result);
		
		sc.close();

	}

}
