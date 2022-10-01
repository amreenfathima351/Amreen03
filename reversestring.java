package reversestring;
import java.util.Scanner;
public class reversestring {

	public static void main(String[] args) {
		String inStr;
		int inStrLen;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		inStr = in.next();
		inStrLen=inStr.length();
		for(int charIdx = inStrLen-1;charIdx>=0;--charIdx) {
			System.out.println("reverse " + inStr +" is "+inStr.charAt(charIdx));
		}

	}

}
