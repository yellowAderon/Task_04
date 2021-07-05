import java.util.Random;
public class Task3 {
	public static void main (String[] args) {
	int firstNumber, secondNumber;
	String compareResult;
	Random rand = new Random();
	firstNumber = rand.nextInt(10000000);
	secondNumber = rand.nextInt(10000000);
	compareResult = comparsion(firstNumber, secondNumber);
	System.out.println("Первое число = "+ firstNumber + " Второе число = " + secondNumber + "\n" + compareResult);
	
	}

	public static String comparsion (int a, int b) {
	int counteFirstNumber = 0, counteSecondNumber = 0;
	String result1, result2, result3;
	result1 = "В первом числе больше цифр";
	result2 = "Во втором числе больше цифр";
	result3 = "Количество цифр в числах одинаковое";
	while (a/10 > 0) {
		a = a/10;
		counteFirstNumber++;
	}
	while (b/10 > 0) {
		b = b/10;
		counteSecondNumber++;
	}
	if (counteFirstNumber > counteSecondNumber) {
		return result1;
	} else if (counteFirstNumber < counteSecondNumber) {
		return result2;
	} else {
		return result3;
	}
	}
}
