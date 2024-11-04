package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		new Exercise11().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		Integer num1, num2, i, sumPar = 0, sumImpar = 0;
		do {
			System.out.println("Introduce un número entero: ");
			num1 = keyboard.nextInt();
			System.out.println("Introduce un número entero: ");
			num2 = keyboard.nextInt();
		} while (num1 >= num2);
		for (i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				sumPar += i;
			} else {
				sumImpar += i;
			}

		}
		System.out.printf("Suma de pares : %d\nSuma de impares: %d", sumPar, sumImpar);
	}
}
