package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		new Exercise7().show();

	}

	@SuppressWarnings("resource")
	public void show() {
		int int1, int2, int3;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int1 = keyboard.nextInt();
		System.out.println("Introduce otro número: ");
		int2 = keyboard.nextInt();
		System.out.println("Introduce un tercer número: ");
		int3 = keyboard.nextInt();
		if ((int1 == int2 && int2 == int3) || (int1 == int2 && int2 > int3) || (int1 > int2 && int2 == int3)
				|| (int1 > int2 && int2 > int3)) {
			System.out.println("El orden de los números es (Tercer número): " + int3 + " (Segundo número): " + int2
					+ " (Primer número): " + int1);
		} else if ((int1 == int3 && int2 < int3) || (int1 > int3 && int3 > int2)) {
			System.out.println("El orden de los números es (Tercer número): " + int2 + " (Segundo número): " + int3
					+ " (Primero número): " + int1);
		} else if ((int1 < int2 && int3 == int1) || (int2 > int1 && int1 > int3)) {
			System.out.println("El orden de los números es (Tercer número): " + int3 + " (Segundo número): " + int1
					+ " (Primer número): " + int2);
		} else if ((int2 > int3 && int1 < int3) || (int2 > int3 && int3 == int1)) {
			System.out.println("El orden de los números es (Tercer número): " + int1 + " (Segundo número): " + int3
					+ " (Primero número): " + int2);
		} else if ((int1 < int3 && int2 == int1) || (int3 > int1 && int1 > int2)) {
			System.out.println("El orden de los números es (Tercer número): " + int2 + " (Segundo número): " + int1
					+ " (Primer número): " + int3);
		} else if ((int2 < int3 && int1 < int2) || (int3 > int2 && int1 == int2)) {
			System.out.println("El orden de los números es (Tercer número): " + int1 + " (Segundo número): " + int2
					+ " (Primer número): " + int3);

		}
	}
}
