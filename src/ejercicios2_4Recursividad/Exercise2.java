package ejercicios2_4Recursividad;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		new Exercise2().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		long n1, n2;
		System.out.println("Introduzca una base: ");
		n1 = keyboard.nextLong();
		System.out.println("Introduzca un exponente positivo: ");
		n2 = keyboard.nextLong();
		if (n2 < 0) {
			throw new IllegalArgumentException("No valen exponentes negativos");
		}
		System.out.printf("El resultado es %d", potency(n1, n2));
	}

	public long potency(long n1, long n2) {
		if (n2 == 0) {
			return 1;
		} else {
			return n1 * potency(n1, n2 - 1);
		}
	}
}
