package resize;

import java.util.Arrays;

public class resize {

	public static void main(String[] args) {
		String[] originalArray = {"A", "B", "C", "D", "E"};
        
		String[] resizedArray = Arrays.copyOf(originalArray, 10);

		resizedArray[5] = "F";

		System.out.println(Arrays.toString(resizedArray));

	}

}
