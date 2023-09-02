package fibonacci;

public class fibonacci {

	public static void main(String[] args) {
		int n=3;
		int fnMinus1=1;
		int fnMinus2=1;
		int nMax=20;
		int sum= fnMinus1+fnMinus2;
		int fn = 0;
		System.out.println("The first"+nMax+"Fibonacci numbers are:");
		while(n<=nMax) {
			System.out.println(fnMinus1+"  ");
			fn=fnMinus1+fnMinus2;
			++n;
			fnMinus1=fnMinus2;
			fnMinus2=fn;
			
			}
		double average=fn/nMax;
		System.out.println("The average is"+average);
		
		
		
		
		
		
		

	}

}