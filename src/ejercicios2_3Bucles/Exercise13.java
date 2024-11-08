package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		new Exercise13().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		final int CODE = 1412;
		int num, i = 3;
		do {
			System.out.println("Introduzca el PIN: ");
			num = keyboard.nextInt();
			i--;
			if ((num != CODE) && i > 0) {
				System.out.printf("Se ha equivocado, le quedan %d %s\n", i, (i == 1) ? "intento" : "intentos");
			} else if (num == CODE) {
				System.out.printf("La contraseña es correcta");
			} else if (num != CODE && i == 0) {
				System.out.printf("Bloqueado");
			}
		} while ((num != CODE) && i > 0);
	}

}
