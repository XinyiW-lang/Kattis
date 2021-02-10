package COMP321;

import java.util.Scanner;

public class t9spelling_260849970 {
	public static String determineNum(int ascii) {
		//a method that returns a string of numbers it should be typed in T9 keyboard
		String str = new String();
		int order = ascii - 96;
		if (order == -64) {
			str = "0";
		}
		if(order<=15) {
			//first 6 keys in the keyboard can be generalized
			if (order%3 == 0) {
				int position = order/3+1;
				for (int i=0; i<3; i++) {
					str = str+position;
				}
			} else {
				int position = order/3+2;
				for (int i=0; i<order%3; i++) {
					str = str+position;
				}
			}
		} else if(16<=order && order<=19) {
			//the condition of alphabets contained by key "7"
			for (int i=0; i<(order-15); i++) {
				str = str+"7";
			}
		} else if (20<=order && order<=22) {
			//the condition of alphabets contained by key "8"
			for (int i=0; i<(order-19); i++) {
				str = str +"8";
			}
		} else {
			//alphabets contained in key "9"
			for (int i=0; i<order-22; i++) {
				str = str+"9";
			}
		}
		return str;
	}
	public static void main(String[] args) {
		//read the user's input
		Scanner input = new Scanner(System.in);
	    int cases = input.nextInt();
	    input.nextLine();
	    String[] result = new String[cases];
		for (int i=0; i<cases; i++) {
			String word = input.nextLine();
	    	String finalStr = new String();
	    	for (int j=0; j<word.length(); j++) {
	    		char character = word.charAt(j);
	    		String groupNum = t9spelling_260849970.determineNum(character);
	    		//check the equality of 2 consecutive strings of numbers
	    		if (!finalStr.isEmpty() && finalStr.charAt(finalStr.length()-1) == groupNum.charAt(0)) {
	    			finalStr = finalStr + " "+ groupNum;
	    		} else {
	    			finalStr = finalStr + groupNum;
	    		}
	    		
	    	}
	    	result[i] = "Case #" + (i+1) +": " +finalStr;
	    }
		for(String s: result) {
			System.out.println(s);
		}
	    input.close();

	}

}
