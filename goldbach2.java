package COMP321;

import java.util.ArrayList;
import java.util.Scanner;

public class goldbach2_260849970 {
	public static boolean isPrime(int n) {
		for (int i = 2; i < (int)(Math.sqrt(n) + 1); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return (n != 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		
		//generate a list of primes, primes are odd except 2, only check odd numbers
		for (int i = 3; i < 32000; i += 2) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		
		int cases = input.nextInt();
		
		for (int i = 0; i < cases; i++) {
			int count = 0;
			String str = "";
			int num = input.nextInt();
			
			for (int j = 0; j < primes.size(); j++) {
				int low = primes.get(j);
				int high = num - primes.get(j);
				
				if (high < low) {
					break;
				}
				
				if (primes.contains(high)) {
					count++;
					str += low + "+" + high + "\n";
					}
				}
			
			System.out.println(num + " has " + count + " representation(s)");
			System.out.println(str);
			}
		
		input.close();
	}

}
