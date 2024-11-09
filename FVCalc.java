// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		double current_value = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) / 100;
		int NumYears = Integer.parseInt(args[2]);
		double FutureValue = Math.pow(1 + rate, NumYears) * current_value;

		System.out.println("After " + NumYears + " years, a $" + (int) current_value  + " saved at " + rate * 100 + "% will yield $" + (int) FutureValue);
	}
}