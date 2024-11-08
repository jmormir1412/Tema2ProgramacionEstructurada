package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		new Exercise16().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		long num, sum = 0, rest;
		System.out.println("Introduzca un número para sumar sus dígitos: ");
		num = keyboard.nextLong();
		do {
			rest = num % 10;
			sum += rest;
			num /= 10;
		} while (num != 0);
		System.out.printf("La suma de los dígitos del número es %d", sum);
	}
}
