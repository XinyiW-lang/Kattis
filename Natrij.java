package COMP321;

import java.util.Arrays;
import java.util.Scanner;

public class Natrij {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	String[] n1 = input.next().split(":");
	String[] n2 = input.next().split(":");

	int[] curT = new int[3];
	int[] tOfExp = new int[3];

	for (int i = 0; i < 3; i++){
	    curT[i] = Integer.parseInt(n1[i]);
	    tOfExp[i] = Integer.parseInt(n2[i]);
	}

	for (int i = 2; i >= 1; i--) {
	    if (tOfExp[i] < curT[i]){
	        tOfExp[i] += 60;
	        tOfExp[i - 1] -= 1;
	    }
	}

	if (tOfExp[0] < curT[0]) {
	   	tOfExp[0] += 24;
	}

	String[] time = new String[3];

	for (int i = 0; i < 3; i++){
		String num = "00" + (tOfExp[i] - curT[i]);
	    time[i] = num.substring(num.length() - 2);
	}
	    
	String arr = Arrays.toString(time).replace("," , ":").replace(" " , "");

	if (Arrays.equals(n1 , n2)) {
	    System.out.println("24:00:00");
	}
	else {
	    System.out.println(arr.substring(1 , arr.length() - 1));
	}

	input.close();
	}
}
