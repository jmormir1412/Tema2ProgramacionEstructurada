package ejercicios2_3Bucles;

import static ejercicios2_3Bucles.Colors.*;

public class Exercise22 {

	public static void main(String[] args) {
		new Exercise22().show();
	}

	public void show() {
		board();
	}

	public void board() {
		int i, j;
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
	}
}
