package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise20 {

	public static void main(String[] args) {
		new Exercise20().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int n;
		System.out.println("Introduce un número de líneas: ");
		n = keyboard.nextInt();
		pyramid(n);
	}

	public void pyramid(int n) {
		for (int line = 1; line <= n; line++) {
			System.out.println("");
			for (int space = 1; space <= n - line; space++) {
				System.out.print(" ");

			}
			for (int block = 1; block <= line; block++) {
				System.out.printf("%d ", block);
			}
		}
	}
}
