package incometaxcalculator;
import java.util.Scanner;
public class incometaxcalculator {

	public static void main(String[] args) {
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		int taxableincome;
		double taxpayable=0;
		Scanner in=new Scanner (System.in);
		System.out.println("Enter the taxable income : $");
		taxableincome=in.nextInt();
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
}
