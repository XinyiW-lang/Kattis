package COMP321;

import java.util.Scanner;

public class erase{
	public static String overWriting(String bin) {
		//flip the binary string
		String flipped = new String();
		for (int i=0; i<bin.length(); i++) {
			if(bin.charAt(i)=='0') {
				flipped += '1';
			} else {
				flipped += '0';
			}
		}
		return flipped;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int times = input.nextInt();
		input.nextLine();
		String before = input.nextLine();
		String after = input.nextLine();
		String out = new String();
		//flipping of binary just has 2 possibilities, can be separated into 2 cases
		if(times % 2 == 1) {
			//if times are odd, flip the binary string
			out = erase_260849970.overWriting(before);
		} else {
			//even, stays the same
			out = before;
		}
		if(out.equals(after)) {
			//compare the expected result and input result, and get the result
			System.out.println("Deletion succeeded");
		} else {
			System.out.println("Deletion failed");
		}
		input.close();
	}

}
