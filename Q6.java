//SUM SQUARE DIFFERENCE
//PROBLEM 6

package euler10QUES;

public class Q6 {

	public static void main(String[] args) {
		int n=100;
		int result=(n*(n+1))/2;
		result=(int) Math.pow(result, 2);
		int result2=0;
		while (n!=0)
		{
			result2=(int) (result2+Math.pow(n, 2));
			n--;
		}
		System.out.println(result-result2);
	}

}
