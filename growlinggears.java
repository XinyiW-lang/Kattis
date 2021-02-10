package COMP321;

import java.util.Scanner;

public class growlinggears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for (int i=0; i<cases; i++) {
			int gears = input.nextInt();
			double max = 0.0;
			int gear = 0;
			for (int j=0; j<gears; j++) {
				double a = -(input.nextInt());
				double b = input.nextInt();
				double c = input.nextInt();
				double localMax = c-Math.pow(b,2)/(4*a);
				if (max < localMax) {
					max = localMax;
					gear = j+1;
				}
			}
			System.out.println(gear);
		}
		input.close();
	}

}
