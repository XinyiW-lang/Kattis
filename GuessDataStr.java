package COMP321;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class GuessDataStr {

	//The comparator used in priority queue
	public static Comparator<Integer> intComparator = new Comparator<Integer>() {
		public int compare(Integer i1, Integer i2) {
			return i2-i1;
	        }
	    };
	 
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

	    //Compare each condition with 3 data structures
	    while (input.hasNext()) {
	        int testNum = input.nextInt();
	        //stack
	        Stack<Integer> stack = new Stack<Integer>(); 
	        // ArrayDeque<> implements both queue and deque
	        Queue<Integer> queue = new ArrayDeque<>();
	     // take larger elements first
	        Queue<Integer> pQueue = new PriorityQueue<>(20, intComparator); 
	          
	        //Assume all data structures initially true
	        boolean isStack = true;
            boolean isQueue = true;
            boolean isPQueue = true;
	        for (int i = 0; i < testNum; i++) {
	            int command = input.nextInt();
	            int x = input.nextInt();
	            if (command == 1) { // command type 1, insert x
	                stack.push(x);
	                queue.add(x);
	                pQueue.add(x);
	            }
	            else { // op == 2, take out something
	                if (stack.isEmpty()) {
	                	//The edge case that command 2 is in the first line of test case
	                	isStack = false;
	                	isQueue = false;
	                	isPQueue =false;
	                    continue;//end the iteration at this time
	                }
	                if (stack.pop() != x) {
	                    isStack = false;
	                }
	                if (queue.poll() != x) {
	                    isQueue = false;
	                }
	                if (pQueue.poll() != x) {
	                    isPQueue = false;
	                }
	            }
	        }  
	        String answer = "";
	        int  quantatity= 0;
	        if (isStack) {
	        	quantatity += 1;
	        } 
	        if (isQueue) {
	          	quantatity += 1;
	        }
	        if (isPQueue) {
	           	quantatity += 1;
	        }
	        if (quantatity > 1) {
	        	// it can be more than one of the three data structures
	            answer = "not sure";
	        }
	        else if (isStack) {
	            answer = "stack";
	        }
	        else if (isQueue) {
	            answer = "queue";
	        }
	        else if (isPQueue) {
	            answer = "priority queue";
	        }
	        else {
	        	//all 3 data structures don't match
	            answer = "impossible"; 
	        }
	         
	        System.out.println(answer);
	    }
	    input.close();                                         
	}
}

