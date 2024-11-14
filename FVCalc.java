// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {

		double current_value = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) / 100;
		int numYears = Integer.parseInt(args[2]);
		double futureValue = Math.pow(1 + rate, numYears) * current_value;

		System.out.println("After " + numYears + " years, a $" + (int) current_value  + " saved at " + rate * 100 + "% will yield $" + (int) futureValue);
	}
}