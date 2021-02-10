package COMP321;

import java.util.Scanner;

public class completingSquare {
	public static double distance(double x1, double y1, double x2, double y2) {
		double d = Math.sqrt(Math.pow((y2-y1), 2)+Math.pow((x2-x1), 2));
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		int dx1 = x1;
		int dy1 = y1;
		int dx2 = x2;
		int dy2 = y2;
		double d1 = distance(x1,y1,x2,y2);
		double d2 = distance(x1,y1,x3,y3);
		double d3 = distance(x2,y2,x3,y3);
		int x4=0;
		int y4=0;
		if (d1 == d2) {
			//int mx = (x2+x3)/2;
			//int my = (y2+y3)/2;
			x4 = (x2+x3)-x1;
			y4 = (y2+y3) -y1;
		} else if (d1 == d3) {
			x4 = (x1+x3)-x2;
			y4 = (y1+y3) -y2;
		} else if (d2 == d3){
			//int mx = (x1+x2)/2;
			//int my = (y1+y2)/2;
			x4 = (x1+x2)-x3;
			y4 = (y1+y2) -y3;
		}
		System.out.println(x4 + " " + y4);
		

	}

}
