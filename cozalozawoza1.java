package cozalozawoza1;

public class cozalozawoza1 {
	public static void main(String[] args) {
		final int LOWERBOUND=1;
		final int UPPERBOUND=110;
		for(int number=LOWERBOUND;number <= UPPERBOUND; number++) {
			if(number % 3 == 0) {
				System.out.println("Coza");
			}
			if(number % 5 == 0) {
				System.out.println("Loza");
			}
			if(number % 7 == 0) {
				System.out.println("Woza");
			}
		if(number%3!=0 && number%5!=0 && number%7!=0 ) {
			System.out.println(""+number);
		}
		if(number>=11) {
			System.out.println();
		}
		else {
			System.out.println("    ");
		}
			
	}
	}
	
}
