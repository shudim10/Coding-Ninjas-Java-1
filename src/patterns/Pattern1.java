package patterns;

import java.util.Scanner;

public class Pattern1 {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        
        while(i<=n)
        {	
            int j = 1;
            int val = i;
			while(j <= i)
            {
                System.out.print(val);
                val++;
                j++;
            }
            System.out.println();
            i++;
		}
        sc.close();
	}

}