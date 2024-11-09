// Prints a given number using hundreds, tens, and units notation.
public class NumWords {
	public static void main(String[] args) {
	    int Num = Integer.parseInt(args[0]);
		int hundreds = (Num / 100) % 10;
		int tens = (Num / 10) % 10;
		int ones = (Num) % 10;

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}
