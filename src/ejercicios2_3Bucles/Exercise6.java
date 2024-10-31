package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		new Exercise6().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int number, i = 0, pass = 0, fail = 0;
		do {
			System.out.print("Introduzca un número del 0 al 10: ");
			number = keyboard.nextInt();
			System.out.printf("Has introducido un %d\n", number);
			if (number < 5) {
				fail++;
				i++;
			} else if (number >= 5 && number <= 10) {
				pass++;
				i++;

			}
			;
		} while (!(number < 0 || number > 10));
		System.out.printf("En la iteración %d has introducido la nota %d\n ", i, number);
		System.out.printf("El número de aprobados es %d y el número de suspensos es %d", pass, fail);
	}

}
