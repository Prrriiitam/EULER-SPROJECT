//10001ST PRIME
//PROBLEM 7

package euler10QUES;

import java.util.*;
public class Q7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i=2;i>0;i++)
		{
			int c=0;
			for (int j=2;j<=i;j++)
			{
				if (i%j==0)
					c++;
			}
			if (c==1)
				count++;
			if(count==10001)
			{
				System.out.println(i);
			break;
			}
		}
	}
}