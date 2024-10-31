package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		new Exercise13().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		Integer num, i = 3;
		do {
			System.out.println("Introduzca el PIN: ");
			num = keyboard.nextInt();
			i--;
			if ((num != 1412) && i > 0)
				System.out.printf("Se ha equivocado, le quedan %d intentos\n", i);
		} while ((num != 1412) && i > 0);
	}

}
