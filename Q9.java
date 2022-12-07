//Special Pythagorean triplet
//PROBLEM 9

package euler10QUES;

public class Q9 {

	public static void main(String[] args) {
		double a;
		for(int b = 1; b<1000; b++) {
			a = ((Math.pow(1000, 2)-2000*b) / (2000-2*b));
			if(Math.floor(a) == a) {
				double c = Math.sqrt((a*a + b*b));
				System.out.println("a = " + a + " b = " + b + " c " + c);
				long product = (long)(a*b*c);
				System.out.println("Product of abc = " + product);break;
			}
		}

	}

}
