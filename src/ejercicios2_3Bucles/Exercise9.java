package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		new Exercise9().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		boolean notExit;
		int num;
		do {
			System.out.println(
					"Introduce un número entre el 0 y el 10, si introduces un número fuera de este intervalo el programa finalizará: ");
			num = keyboard.nextInt();
			notExit = num >= 0 && num <= 10;
			if (num >= 0 && num <= 10) {
				System.out.printf("\nLa tabla de multiplicar del %d es:\n", num);
				for (int i = 0; i <= 10; i++) {
					System.out.printf("%d x %2d  = %-2d\n", num, i, num * i);
				}
			}
		} while (notExit);
	}
}
