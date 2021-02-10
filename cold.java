package COMP321;

import java.util.Scanner;

public class cold {
	public static void main(String[] args) {
		//get user's input
		Scanner input = new Scanner(System.in);
		int count = 0;
		int cases = input.nextInt();
		for (int i=0; i<cases; i++) {
			//count the num of degrees
			int num = input.nextInt();
		   	if (num < 0) {
		   		count += 1;
		   		}
		   	}
		    input.close();
		    System.out.println(count);
		}
	

}
