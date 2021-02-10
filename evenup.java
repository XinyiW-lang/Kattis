package COMP321;

import java.util.Scanner;
import java.util.Stack;

public class evenup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		Stack<Integer> cards = new Stack<>();
		for (int i=0; i<n; i++) {
			int card = input.nextInt();
			if (!cards.isEmpty() && (card+cards.peek())%2 == 0) {
				cards.pop();
			} else {
				cards.push(card);
			}
		}
		System.out.println(cards.size());
		input.close();

	}

}
