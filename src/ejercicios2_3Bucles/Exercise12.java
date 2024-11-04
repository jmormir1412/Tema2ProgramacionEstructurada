package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		new Exercise12().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		Integer num1, num2, i;
		do {
			System.out.println("Introduzca un número positivo: ");
			num1 = keyboard.nextInt();
			System.out.println("Introduzca un número positivo: ");
			num2 = keyboard.nextInt();
		} while (num1 < 0 || num2 < 0);
		{
			if (num1 < num2) {
				for (i = num1; i <= num2; i *= 2, num2 /= 2) {
					System.out.printf("Primer número: %d  Segundo número: %d\n", i, num2);
				}
				System.out.printf("Primer número: %d  Segundo número: %d\n", i, num2);
			} else {
				System.out.println("El primer número debe ser menor que el segundo");
			}
		}
	}
}
