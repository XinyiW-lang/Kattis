package COMP321;

import java.util.Scanner;

public class easiest {
	public static int getIntSum(int num) {
		int intsum = 0;
		while (num > 0) {
            intsum = intsum + num % 10;
            num = num / 10;
        }
		return intsum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		while(n != 0) {
			int p = 11;
			int intSum = getIntSum(n);
			while(getIntSum(p*n) != intSum) {
				p++;
			}
			System.out.println(p);
			//System.out.println(intsum);
			//System.out.println(n);
			n = input.nextInt();
		}
		input.close();
	}


}
