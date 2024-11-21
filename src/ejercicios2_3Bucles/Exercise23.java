package ejercicios2_3Bucles;

import static ejercicios2_3Bucles.Colors.*;

import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {
		new Exercise23().show();
	}

	public void show() {
		bishop();
	}

	@SuppressWarnings("resource")
	public void bishop() {
		Scanner keyboard = new Scanner(System.in);
		int i, j, row, column;
		for (char letter = 'a'; letter <= 'h'; letter++) {
			System.out.printf(" %c", letter);
		}
		for (i = 8; i >= 1; i--) {
			System.out.printf("\n%d", i);
			for (j = 8; j >= 1; j--) {
				if ((i + j) % 2 == 0) {
					System.out.printf("%s  %s", WHITE_BACKGROUND, RESET);

				} else {
					System.out.printf("%s  %s", BLACK_BACKGROUND, RESET);

				}
			}
			System.out.printf("%d", i);
		}
		System.out.println();
		for (char letter = 'a'; letter <= 'h'; letter++) {
			System.out.printf(" %c", letter);
		}
		System.out.printf("\nIntroduzca un número de fila (Entre el 1 y el 8): ");
		row = keyboard.nextInt();
		if (row < 1 || row > 8) {
			throw new IllegalArgumentException("Número de fila no válido");
		}
		System.out.println("Introduza una columna, el 1 es la letra h, puede alcanzar hasta el número 8 (a): ");
		column = keyboard.nextInt();
		if (column < 1 || column > 8) {
			throw new IllegalArgumentException("Columna no existente");
		}
		for (char letter = 'a'; letter <= 'h'; letter++) {
			System.out.printf(" %c", letter);
		}
		for (i = 8; i >= 1; i--) {
			System.out.printf("\n%d", i);
			for (j = 8; j >= 1; j--) {
				if (i == row && j == column) {
					System.out.printf("%s  %s", BLUE_BACKGROUND, RESET);

				} else if (i - j + column == row || (j + i - column == row)) {
					System.out.printf("%s  %s", RED_BACKGROUND, RESET);

				} else if ((i + j) % 2 == 0) {
					System.out.printf("%s  %s", WHITE_BACKGROUND, RESET);

				} else {
					System.out.printf("%s  %s", BLACK_BACKGROUND, RESET);

				}
			}
		}
	}

}
