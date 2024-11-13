package ejercicios2_4Recursividad;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		new Exercise3().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int n;
		System.out.println("Introduce un número de la serie: ");
		n = keyboard.nextInt();
		if (n < 0) {
			throw new IllegalArgumentException("No valen números negativos");
		}
		System.out.printf("El número de la serie correspondiente es %d", fibonacci(n));
	}

	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
