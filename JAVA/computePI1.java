package computePI1;

public class computePI1 {

	public static void main(String[] args) {
		double sum=0.0;
		int MAX_DENOMINATOR =1000;
		for(int denominator=1;denominator<=MAX_DENOMINATOR;denominator+=2) {
			if(denominator%4==1) {
				sum+=denominator;
			}
			else if(denominator%4==3) {
				sum-=denominator;
			}
			else {
				System.out.println("Impossible");
			}
		}
		System.out.println("compute the value of PI "+sum);

	}

}
