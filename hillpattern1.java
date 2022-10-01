package hillpattern1;
import java.util.Scanner;
public class hillpattern1 {

	public static void main(String[] args) {
		int rows,numRows=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		rows = in.nextInt();
		for(int row = 1; row<=rows;row++) {
			for(int col =1;col<=rows;col++) {
				if((row+col>=numRows+1)&&(row>=col-numRows+1)) {
					
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
