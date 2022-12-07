//FACTORIIAL DIGIT SUM

package euler10QUES;

import java.math.BigInteger;

public class Q3 {

	public static void main(String[] args) {
		int n=100;
		BigInteger product=BigInteger.ONE;
		while (n!=0)
		{
			product=product.multiply(BigInteger.valueOf(n));
			n--;
		}
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger modulo = BigInteger.valueOf(0);
		while (!product.equals(BigInteger.ZERO)) {
			modulo=product.mod(BigInteger.valueOf(10));
			sum=sum.add(modulo);
			product=product.divide(BigInteger.valueOf(10));
		}
		System.out.println(sum);
	}

}
