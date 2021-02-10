package COMP321;

import java.util.Arrays;
import java.util.Scanner;

public class narrowartgallery {
	public static int findPath(int n, int k, int[] gallery) {
		//initialize a n by (k+1) by 3 table with a small enough initial value, i.e. -50 
		int[][][] storage = new int[n][k+1][3];
		for (int i=0; i<n; i++) {
			for(int j=0; j<k+1; j++) {
				Arrays.fill(storage[i][j], -50);
			}
		}
		//The last element in storage[i][0] is used to store the total sum until then
		storage[0][0][2] = gallery[0]+gallery[1];
		for (int i=1; i<n; i++) {
			storage[i][0][2]=storage[i-1][0][2]+gallery[2*i]+gallery[2*i+1];
		}
		if(k>0) {
			storage[0][1][0]=gallery[1];
			storage[0][1][1]=gallery[0];
			storage[0][1][2]=-50;
		}
		for(int i=1; i<n; i++) {
			for (int j=1; j<Math.min(i+1, k)+1; j++) {
				storage[i][j][0] = gallery[2*i+1]+Math.max(storage[i-1][j-1][2], storage[i-1][j-1][0]);
				storage[i][j][1] = gallery[2*i]+Math.max(storage[i-1][j-1][2], storage[i-1][j-1][1]);
				storage[i][j][2] = gallery[2*i]+ gallery[2*i+1] +Math.max(storage[i-1][j][2], Math.max(storage[i-1][j][0], storage[i-1][j][1]));
			}
		}
		return Math.max(Math.max(storage[n-1][k][1], storage[n-1][k][2]), storage[n-1][k][0]);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int k = input.nextInt();
		int[] gallery = new int[2*n+2];
		for (int i=0; i<n*2+2; i++) {
			gallery[i] = input.nextInt();
		}
		int result = findPath(n, k,  gallery);
		System.out.println(result);
		input.close();

	}

}
