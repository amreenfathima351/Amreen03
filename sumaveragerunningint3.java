package sumaveragerunningint3;

public class sumaveragerunningint3 {

	public static void main(String[] args) {
		int sum=0;
		double average;
		final int LOWERBOUND=1;
		final int UPPERBOUND=100;
		int number=LOWERBOUND;
		do{
			sum+=number;
			++number;
		}while(number<=UPPERBOUND);
		System.out.println("The sum of 1 to 100 is : "+sum);
		average=sum/UPPERBOUND;
		System.out.println("The average is : "+average);


	}

}
