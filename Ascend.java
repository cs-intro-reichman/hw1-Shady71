// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * num);
		int b = (int) (Math.random() * num);
		int c = (int) (Math.random() * num);

		int check1 = Math.min(a, b);
		int SmallestNum = Math.min(check1, c);

		int check2 = Math.max(a, b);
		int LargestNum = Math.max(check2, c);
		int MiddleNum = a + b + c - LargestNum - SmallestNum;

		System.out.println(SmallestNum + " " + MiddleNum + " " + LargestNum);
		System.out.println(LargestNum + " " + MiddleNum + " " + SmallestNum);


	}
}

