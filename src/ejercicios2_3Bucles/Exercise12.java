package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		new Exercise12().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		Integer num1, num2;
		System.out.println("Introduzca un número positivo: ");
		num1 = keyboard.nextInt();
		System.out.println("Introduzca un número positivo: ");
		num2 = keyboard.nextInt();
		if (num1 <= 0 || num2 <= 0) {
			System.out.println("Números no válidos");
		} else if (num1 < num2 && num1 > 0 && num2 > 0) {
			;
			for (int i = num1, j = num2; !(i > j); i = num1*2, j = num2/2) {
				System.out.printf("i: %d j:%d\n", i, j);
				num1 = i;
				num2 = j;
			}
			System.out.printf("Primer número: %d Segundo número:%d\n", num1, num2);
		} else if (num1 > num2) {
			System.out.println("EL primer número debe ser menor que el segundo.");
		}

	}
}
