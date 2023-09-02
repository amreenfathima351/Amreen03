package sum;

public class sum {

	public static void main(String[] args) {
		int sumOdd=0;
		int sumEven=0;
		int absdiff;
		for(int number=1;number<=100;number++) {
			if(number%2!=0) {
				sumOdd+=number;
			}
			else {
				sumEven+=number;
			}
		}
		System.out.println("Sum of even elements "+sumEven);
		System.out.println("Sum of odd elements "+sumOdd);
		if(sumOdd>sumEven) {
			absdiff=sumOdd-sumEven;
			System.out.println("Absolute difference "+absdiff);
		}
		else {
			absdiff=sumEven-sumOdd;
			System.out.println("Absolute difference "+absdiff);
		}

	}

}
