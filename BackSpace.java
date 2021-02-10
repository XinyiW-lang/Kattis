package COMP321;

import java.util.Scanner;


public class BackSpace_260849970 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		StringBuilder output = new StringBuilder();
		for (int i=0; i<word.length();i++) {
			char c = word.charAt(i);
			if (c != '<') {
				//output = output + c;
				output.append(c);
			} else {
				/*int len = output.length();
				output=output.substring(0,len-1);, too slow*/
				int len = output.length();
				output.deleteCharAt(len-1);				
			}
		}
		System.out.println(output);

	}

}