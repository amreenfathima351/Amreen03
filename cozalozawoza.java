package cozalozawoza;

public class cozalozawoza {

	public static void main(String[] args) {
		final int LOWERBOUND=1;
		final int UPPERBOUND=110;
		boolean printed;
		for(int number=LOWERBOUND;number <= UPPERBOUND; number++) {
			printed=false;
			if(number % 3 == 0) {
                System.out.println("Coza");
                printed=true;
            }
			if(number % 5 == 0) {
				 System.out.println("Loza");
				 printed=true;
            }
			if(number % 7 == 0) {
				 System.out.println("Woza");
				 printed=true;
            }
			if(!printed) {
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