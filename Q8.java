//POWER DIGIT SUM
//PROBLEM 16

package euler10QUES;

import java.math.BigInteger;

public class Q8 {

	public static void main(String[] args) {
		int a = 2;
		int b = 1000;
	
		BigInteger number = new BigInteger(String.valueOf(a));
	
		BigInteger power = number.pow(b);
		
		String powerInString = String.valueOf(power);
		int length = powerInString.length();
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < length; i++) {

			temp = powerInString.charAt(i) - 48;
			sum += temp;
		}
		System.out.println("The sum of the digits of the number 2^1000 is : " + sum);
	}

}
