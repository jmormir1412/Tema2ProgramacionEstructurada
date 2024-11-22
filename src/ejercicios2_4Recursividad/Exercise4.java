package ejercicios2_4Recursividad;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		new Exercise4().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int disc, rod1 = 1, rod2 = 2, rod3 = 3;
		do {
			System.out.println("Introduce el número de discos: ");
			disc = keyboard.nextInt();
		} while (disc < 1);
		hanoi(disc, rod1, rod2, rod3);
	}

	public void hanoi(int disc, int rod1, int rod2, int rod3) {
		if (disc == 1) {
			System.out.printf("%d --> %d\n", rod1, rod3);
		} else {
			hanoi(disc - 1, rod1, rod3, rod2);
			System.out.printf("%d --> %d\n", rod1, rod3);
			hanoi(disc - 1, rod2, rod1, rod3);
		}
	}
}
