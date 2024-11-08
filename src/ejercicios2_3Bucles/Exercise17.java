package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		new Exercise17().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int num;
		System.out.println("Introduce un número: ");
		num = keyboard.nextInt();
		if (isPrime(num)) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
		System.out.println("Primos del 1 al 10000");
		primeTo10000();
		decompound(num);
	}

	public boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	private void primeTo10000() {
		for (int i = 2; i <= 10000; i++) {
			if (isPrime(i))

				System.out.println(i);
		}
	}

	private void decompound(int num) {
		int i = 2, y = num;
		boolean first = true;
		System.out.printf("%d = ", num);
		while (i < num) {
			if (isPrime(i) && y % i == 0) {
				y /= i;
				if (first) {
					System.out.printf("%d", i);
					first = false;
				} else {
					System.out.printf("* %d", i);
				}
				i = 2;

			} else {
				i++;
			}
		}
		if (y == num) {
			System.out.println(num);
		}
	}
}