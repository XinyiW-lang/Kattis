package COMP321;

import java.util.Scanner;

public class sodaSlurper {
	public static void main(String[] string) {
		Scanner input = new Scanner(System.in);
		int e = input.nextInt();
		int f = input.nextInt();
		int c = input.nextInt();
		int cur = e+f;
		//System.out.println("cur: "+ cur);
		int res = cur / c;
		//System.out.println("res: "+res);
		int remainder = cur % c + res;
		//System.out.println("remainder: "+ remainder);
		while (remainder >= c) {
			res += remainder/c;
			//System.out.println("res: "+res);
			remainder = remainder/c + remainder % c;
			//System.out.println("remainder: "+ remainder);
		}
		System.out.println(res);
		input.close();
	}
}
