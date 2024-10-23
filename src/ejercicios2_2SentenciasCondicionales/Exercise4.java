package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		new Exercise4().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int num;
		System.out.println("Introduce un número: ");
		num = keyboard.nextInt();
		if (num > 0) {
			System.out.println("Positivo");
		} else if (num < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Cero");
		}
	}

}
