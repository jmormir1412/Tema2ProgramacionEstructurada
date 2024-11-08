package ejercicios2_3Bucles;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		new Exercise14().show();
	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		int code, num, num1;
		do {
			System.out.println("Inserte el menú deseado: 1.Suma 2.Resta 3.Salir. Si desea salir, pulse 3. ");
			code = keyboard.nextInt();
			if (code <= 0 || code >= 4) {
				System.out.println("Número de menú no disponible");
			} else if (code == 1) {
				System.out.println("Inserta dos números: ");
				num = keyboard.nextInt();
				num1 = keyboard.nextInt();
				num += num1;
				System.out.printf("La suma de los números es %d\n", num);
			} else if (code == 2) {
				System.out.println("Inserta dos números: ");
				num = keyboard.nextInt();
				num1 = keyboard.nextInt();
				num -= num1;
				System.out.printf("La resta de los números es %d\n", num);
			} else if (code == 3) {
				System.out.println("Finalizado");
			}
		} while (code != 3);

	}
}
