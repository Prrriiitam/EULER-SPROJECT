//SMALLEST MULTIPLE 
//PROBLEM 5

package euler10QUES;

public class Q5 {

	public static void main(String[] args) {
		int num = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) 
        {
            if (i % 20 == 0 && i % 19 == 0 && i % 18 == 0 && i % 17 == 0
                    && i % 16 == 0 && i % 14 == 0 && i % 13 == 0
                    && i % 11 == 0) 
            {
                num = i;
                break;
            }
        }
        System.out.println(num);
	}

	}


