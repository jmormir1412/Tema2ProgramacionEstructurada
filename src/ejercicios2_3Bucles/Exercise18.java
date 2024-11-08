package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		new Exercise18().show();
	}

	public void show() {
		pyramid();
	}

	@SuppressWarnings("resource")
	public void pyramid() {
		Scanner keyboard = new Scanner(System.in);
		int n;
		System.out.println("Introduce un número de líneas: ");
		n = keyboard.nextInt();
		for (int line = 1; line <= n; line++) {
			System.out.println("");
			for (int space = 1; space <= n - line; space++) {
				System.out.print(" ");

			}
			for (int block = 1; block <= line; block++) {
				System.out.print("* ");
			}
		}
	}
}
