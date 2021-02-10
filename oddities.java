package COMP321;

import java.util.Scanner;

public class oddities_260849970 {
	public static void main(String[] args) {
			//read the inputs
		    Scanner input = new Scanner(System.in);
		    int cases = input.nextInt();
		    for (int i=0; i<cases; i++) {
		    	int num = input.nextInt();
		    	//use modular to determine the oddities
		    	if (num%2 ==0) {
		    		System.out.println(num + " is even");
		        } else {
		        	System.out.println(num + " is odd");
		        }
		    }
		    input.close();
		}
}
