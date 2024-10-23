package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		new Exercise5().show();
		new Exercise5().withswitch();

	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int num;
		System.out.println("Introduce un número: ");
		num = keyboard.nextInt();
		if (num >= 0 && num < 3) {
			System.out.println("Muy deficiente");
		} else if (num == 3 || num == 4) {
			System.out.println("Insuficiente");
		} else if (num == 5) {
			System.out.println("Suficiente");
		} else if (num == 6) {
			System.out.println("Bien");
		} else if (num == 7 || num == 8) {
			System.out.println("Notable");
		} else if (num == 9 || num == 10) {
			System.out.println("Sobresaliente");
		}
	}

	@SuppressWarnings("resource")
	public void withswitch() {
		Scanner keyboard = new Scanner(System.in);
		int num;
		System.out.println("Introduce un número: ");
		num = keyboard.nextInt();
		switch (num) {
		case 0:
		case 1:
		case 2:
			System.out.println("Muy deficiente");
			break;
		case 3:
		case 4:
			System.out.println("Deficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;

		}

	}
}
