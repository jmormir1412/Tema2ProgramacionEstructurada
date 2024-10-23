package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		new Exercise2().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int num;
		System.out.println("Introduce un número: ");
		num = keyboard.nextInt();
		if (num % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
}
