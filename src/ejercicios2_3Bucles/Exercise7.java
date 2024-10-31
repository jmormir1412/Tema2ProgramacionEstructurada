package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		new Exercise7().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int number, i = 0, pass = 0, fail = 0, sump = 0, sumf = 0;
		do {
			System.out.print("Introduzca un número del 0 al 10: ");
			number = keyboard.nextInt();
			System.out.printf("Has introducido un %d\n", number);
			if (number < 5 && number >= 0) {
				fail++;
				i++;
				sumf += number;
			} else if (number >= 5 && number <= 10) {
				pass++;
				i++;
				sump += number;
			}
		} while (!(number < 0 || number > 10));
		System.out.printf("En la iteración %d has introducido la nota %d\n ", i, number);
		System.out.printf("El número de aprobados es %d y el número de suspensos es %d\n", pass, fail);
		System.out.printf("La media de aprobados es %d y la media de suspensos es %d", sump / pass, sumf / fail);
	}
}
