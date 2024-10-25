package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		new Exercise6().show();

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
		if (int1 == int2 && int2 == int3) {
			System.out.println("Hay tres números iguales a " + int1);
		} else if (int1 == int2 && int2 != int3) {
			System.out.println("Hay dos números iguales a " + int1);
		} else if (int1 != int2 && int2 == int3) {
			System.out.println("Hay dos números iguales a " + int2);
		} else if (int1 != int2 && int1 == int3) {
			System.out.println("Hay dos números iguales a " + int1);
		} else if (int1 != int2 && int1 != int3) {
			System.out.println("No hay números iguales");

		}

	}
}
