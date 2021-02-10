package COMP321;

import java.util.Scanner;

public class commercials_260849970 {
	public static void main(String[] args) {
		//read the inputs
	    Scanner input = new Scanner(System.in);
	    int cases = input.nextInt();
	    int price = input.nextInt();
	    //create an array to store the profits of each time period
	    int[] profitArray = new int[cases];
	    //initialize the array with profit
	    for (int i=0; i<cases; i++) {
	    	int num = input.nextInt();
	    	profitArray[i] = num-price;
	    }
	    int currentMax = profitArray[0];
	    int maxEnd = profitArray[0];
	    for (int i=1; i<cases; i++) {
	    	maxEnd = Math.max(profitArray[i], profitArray[i]+maxEnd);
	    	currentMax = Math.max(currentMax, maxEnd);
	    }
	    System.out.println(currentMax);
	}


}
