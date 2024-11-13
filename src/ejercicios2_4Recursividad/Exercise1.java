package ejercicios2_4Recursividad;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		new Exercise1().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduzca un número positivo: ");
		n1 = keyboard.nextInt();
		System.out.println("Introduzca un número positivo: ");
		n2 = keyboard.nextInt();
		if (n1 <= 0 || n2 <= 0) {
			throw new IllegalArgumentException("No valen números negativos");
		}
		System.out.printf("El máximo común divisor es %d", mcd(n1, n2));
	}

	public int mcd(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		} else {

			return mcd(n2, n1 % n2);
		}
	}
}
