package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		new Exercise3().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int num, num1;
		System.out.println("Introduce un número: ");
		num = keyboard.nextInt();
		System.out.println("Introduce otro número: ");
		num1 = keyboard.nextInt();
		if (num % num1 == 0) {
			System.out.println("Son múltiplos");
		} else {
			System.out.println("No son múltiplos");
		}
	}
}
