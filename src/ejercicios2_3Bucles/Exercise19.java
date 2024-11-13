package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
		new Exercise19().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int n;
		System.out.println("Introduce un número de líneas: ");
		n = keyboard.nextInt();
		diamond(n);
	}

	public void diamond(int n) {
		for (int line = 1; line <= n; line++) {
			System.out.println("");
			for (int space = 1; space <= n - line; space++) {
				System.out.print(" ");

			}
			for (int block = 1; block <= line; block++) {
				System.out.print("* ");
			}
		}
		for (int line = n - 1; line >= 1; line--) {
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
