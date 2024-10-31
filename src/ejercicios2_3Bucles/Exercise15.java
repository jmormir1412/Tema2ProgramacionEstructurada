package ejercicios2_3Bucles;

import java.util.*;

public class Exercise15 {

	public static void main(String[] args) {
		new Exercise15().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		Integer num, num1, i = 0;
		num = random.nextInt(100) + 1;
		do {
			System.out.println("Intente adivinar el número: ");
			num1 = keyboard.nextInt();
			if (num1 < num) {
				i++;
				System.out.printf("El número elegido es más pequeño que el correcto, lleva %d intentos\n", i);
			} else if (num1 > num) {
				i++;
				System.out.printf("El número elegido es más grande que el correcto, lleva %d intentos\n", i);
			}
		} while (num != num1);
		System.out.printf("Ha acertado el número, era %d", num);
	}
}
