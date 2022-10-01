package ExtractDigits;

public class ExtractDigits {

	public static void main(String[] args) {
		int n = 110102;
		while(n>0) {
			int digit = n%10;
			System.out.println(digit);
			n=n/10;
		}

	}

}
