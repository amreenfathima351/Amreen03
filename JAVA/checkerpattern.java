package checkerpattern;

import java.util.Scanner;

public class checkerpattern {

	public static void main(String[] args) {
		int size;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size : ");
		size=in.nextInt();
		for(int row=1;row<=size;row++) {
			for(int col=1;col<=size;col++) {
				if((row+col)%2==0) {
					System.out.print("#");
				}
				else {
					System.out.print( " " );
				}
				
			}
			System.out.println();
		}

	}

}
