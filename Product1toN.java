package Product1toN;

public class Product1toN {

	public static void main(String[] args) {
		int product =1;
		final int LOWERBOUND=1;
		final int UPPERBOUND=10;
		for(int number=LOWERBOUND;number<=UPPERBOUND;++number) {
			product*=number;
		}
		System.out.println("Product of 1 to 10 "+product);

	}

}
