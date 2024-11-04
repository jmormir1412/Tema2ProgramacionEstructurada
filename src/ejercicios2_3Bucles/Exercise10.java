package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		new Exercise10().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		Integer num1, num2, num3;
		do {
			System.out.println("Introduce un número positivo: ");
			num1 = keyboard.nextInt();
			num3 = num1;
			System.out.println("Introduce un número positivo: ");
			num2 = keyboard.nextInt();
			if (num1 < 0 || num2 < 0) {
				System.out.println("Número no válido");
			} else if (num1 >= 0 || num2 >= 0) {
				for (int i = 1; (!(num1 >= num1 * num2)) && i < num2; num1 += num3, i++) {
					System.out.printf("Sumando números...\n");

				}
				System.out.printf("El resultado es %d\n", num1);
			}
		} while (!(num1 < 0 || num2 < 0));
	}

}
