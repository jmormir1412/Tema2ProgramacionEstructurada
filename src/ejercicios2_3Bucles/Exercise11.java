package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		new Exercise11().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int num1, num2, sumPar = 0, sumImpar = 0;
		do {
			System.out.println("Introduce un número entero: ");
			num1 = keyboard.nextInt();
			System.out.println("Introduce un número entero: ");
			num2 = keyboard.nextInt();
		} while (num1 >= num2);
		System.out.printf("Suma de pares : %d\nSuma de impares: %d", sumPar(num1, num2, sumPar),
				sumImpar(num1, num2, sumImpar));
	}

	public int sumPar(int num1, int num2, int sumPar) {
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				sumPar += i;
			}
		}

		return sumPar;
	}

	public int sumImpar(int num1, int num2, int sumImpar) {
		for (int i = num1; i <= num2; i++) {
			if (i % 2 != 0) {
				sumImpar += i;
			}
		}
		return sumImpar;
	}
}