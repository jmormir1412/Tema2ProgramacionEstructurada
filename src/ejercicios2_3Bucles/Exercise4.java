package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		new Exercise4().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int number;
		do {
			System.out.print("Introduzca un número del 0 al 10: ");
			number = keyboard.nextInt();
			System.out.printf("Has introducido un %d\n", number);
		} while (!(number < 0 || number > 10));

	}
}
