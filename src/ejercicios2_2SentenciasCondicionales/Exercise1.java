package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		new Exercise1().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int num;
		double result;
		System.out.println("Introduce un número: ");
		num = keyboard.nextInt();
		if (num > 1000) {
			result = num * 0.15;
			System.out.println("El resultado es: " + result);
		}
	}
}