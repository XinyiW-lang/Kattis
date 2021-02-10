package COMP321;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class plantingtrees_260849970 {
	public static int plan(PriorityQueue<Integer> queue) {
		int result=queue.remove();
		int restDays = result-1;
		int counter = 1;
		while (!queue.isEmpty()) {
			counter++;
			int m = queue.remove();
			if (restDays< m) {
				result += m-(restDays);
			}
			restDays = result - counter;
		}
		return result;
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int seeds = input.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<>(seeds, Collections.reverseOrder());
		for (int i=0; i<seeds; i++) {
			queue.add(input.nextInt());
		}
		System.out.println(plan(queue)+2);

	}

}
