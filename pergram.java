package COMP321;
import java.util.Scanner;

class pergram{
	public static int getChar(char c){
		   return (c - 'a');
		 }
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next().toLowerCase();

		int arr[] = new int[26];

		for(int i = 0; i<s.length(); i++){
			int index = getChar(s.charAt(i));
			arr[index]++;
		}
		
		if(s.length()%2 == 1){ 
			int count = 0;
			for(int i = 0; i<arr.length; i++){
				if(arr[i]%2 == 1 && arr[i] != 0){
					count++;
				}
			}

			if(count>1){
				System.out.println(count-1);
			}

			else {
				System.out.println("0");
			}
		}

		else{
			int count = 0;
			for(int i = 0; i<arr.length; i++){
				if(arr[i]%2 == 1 && arr[i] != 0){
					count++;
				}
			}
			if(count>0) {
				System.out.println(count-1);
			} else {
				System.out.println(count);
			}
		}

		input.close();
	}

 
}