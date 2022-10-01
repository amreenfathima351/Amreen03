package incometaxcalculatorwithsentinel;
import java.util.Scanner;
public class incometaxcalculatorwithsentinel {

	public static void main(String[] args) {
		final int SENTINEL = -1;
		int taxableincome;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the taxable income (or -1 to end) : $ ");
		taxableincome=in.nextInt();
		while(taxableincome!=SENTINEL) {
			double taxpayable;
			if(taxableincome<=20000) {
				taxpayable=0;	
			}
			else if(taxableincome<=40000) {
				taxpayable= 0.1*(taxableincome-20000);	
			}
			else if(taxableincome<=60000) {
				taxpayable= 0.2*(taxableincome-40000);	
			}
			else {
				taxpayable= 0.3*(taxableincome-60000);	
			}
			System.out.println("The income tax payable is : $"+taxpayable);
		}
		System.out.println("BYE");
	}

}
