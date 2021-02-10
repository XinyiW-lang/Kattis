package COMP321;

import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = input.nextInt();
		int time  = input.nextInt();
		int [] nums = new int[total];

		for (int i = 0; i < total; i++)
			nums[i] = input.nextInt();

		int count = 0;

		for (int i = 0; i < total; i++){
			time -= nums[i];
    
			if (time >= 0) {
				count++;
			}
		}

		System.out.println(count);
    
		input.close();
    }
}

		/*Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int totalT = input.nextInt();
		int counter = 0;
		int curSum = 0;
		while(input.hasNext()) {
			int t = input.nextInt();
			if(curSum + t < totalT) {
				counter += 1;
				curSum += t;
			}else {
				System.out.println(counter);
				break;
			}
		}*/
