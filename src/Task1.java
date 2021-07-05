import java.util.Random;

public class Task1 {
	public static void main(String[] arghs) {
		int firstNumber, secondNumber;
		Random rand = new Random();
		firstNumber = rand.nextInt(10);
		secondNumber = rand.nextInt(10);

		int gcd = gcd(firstNumber, secondNumber);
		int lcm = lcm(firstNumber, secondNumber);
		System.out.println(
				"Первое||второе число: " + firstNumber + "||" + secondNumber + "\nНОД = " + gcd + "\nНОК = " + lcm);
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
