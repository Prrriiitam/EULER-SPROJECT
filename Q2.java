//fibonacci sequence whose value does not exceed 4000000

package euler10QUES;

public class Q2 {

	public static void main(String[] args) {
		int limit=4000000;
		 int a=1;
		 int b=2;
		 int sum =2;
		 int c=a+b;
		 while(c<limit) {
			 a=b;
			 b=c;
			 c=a+b;
			 if(c%2==0)
				 sum +=c;
		 }
		 System.out.println(sum);
	}

}
