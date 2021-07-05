import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
		int firstNumber, secondNumber, thirdNumber, min, max, sum;
		Random rand = new Random();
		firstNumber = (rand.nextInt(30) - 20);
		secondNumber = (rand.nextInt(30) - 20);
		thirdNumber = (rand.nextInt(30) - 20);

		System.out.println(
				"Первое число = " + firstNumber + " Второе число = " + secondNumber + " Третье число = " + thirdNumber);
		max = comparisonMax(firstNumber, secondNumber, thirdNumber);
		min = comparisonMin(firstNumber, secondNumber, thirdNumber);
		sum = sum(max,min);
		System.out.print("\nMax = " + max + " Min = " + min + "\nSumm = " + sum);
	}

	public static int comparisonMax(int a, int b, int c) {
		int max;
		if (a > b & a > c) {
			max = a;
		} else if (b > c & b > a) {
			max = b;
		} else {
			max = c;
		}
		return max;
	}
	
	public static int comparisonMin(int a, int b, int c) {
		int min;
		if (a < b & a < c) {
			min = a;
		} else if (b < c & b < a) {
			min = b;
		} else {
			min = c;
		}
		return min;
	}
	
	public static int sum (int a, int b) {
		int sum; 
		sum = a + b;
		return sum;
	}
	
}
