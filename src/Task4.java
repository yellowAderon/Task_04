import java.util.Random;

public class Task4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int arrayLength = 6;
		int firstSumm, secondSumm, thirdSumm, summSecondVersion;
		System.out.print("Длинна массива = " + arrayLength);
		int[] array = new int[arrayLength];

		System.out.print("\nВсе значения последовательности: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(50);
			System.out.printf("ar[" + i + "] " + array[i] + " ");
		}
		int[] result = summVersionTwo(array);
		firstSumm = summ(array[0], array[1], array[2]);
		secondSumm = summ(array[2], array[3], array[4]);
		thirdSumm = summ(array[3], array[4], array[5]);
		System.out.println("\nCумма 1-3 = " + firstSumm + " |версия2| " + result[0] + "\nСумма 3-5 = " + secondSumm
				+ " |версия2| " + result[1] + "\nСумма 4-6 = " + thirdSumm + " |версия2| " + result[2]);
	}

	public static int summ(int a, int b, int c) {
		int summ;
		summ = a + b + c;
		return summ;
	}

	public static int[] summVersionTwo(int[] a) {
		int firstSumm, secondSumm, thirdSumm;
		firstSumm = a[0] + a[1] + a[2];
		secondSumm = a[2] + a[3] + a[4];
		thirdSumm = a[3] + a[4] + a[5];
		return new int[] { firstSumm, secondSumm, thirdSumm };
	}
}
