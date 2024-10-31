package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		new Exercise5().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int number, i = 0;
		do {
			System.out.print("Introduzca un número del 0 al 10: ");
			number = keyboard.nextInt();
			System.out.printf("Has introducido un %d\n", number);
			i++;
		} while (!(number < 0 || number > 10));
		System.out.printf("En la iteración %d has introducido la nota %d ", i, number);
	}
}
