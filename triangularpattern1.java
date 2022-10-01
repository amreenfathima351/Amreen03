package triangularpattern1;

import java.util.Scanner;

public class triangularpattern1 {

	public static void main(String[] args) {
		int size;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size : ");
		size = in.nextInt();
		for(int row=1;row <=size;row++) {
			for(int col=1;col<=size;col++) {
				if(row + col <= size +1) {
					System.out.print(" # ");
				}
				else {
					System.out.print(" ");
				}

	}
			System.out.println();
		}
	}
}
