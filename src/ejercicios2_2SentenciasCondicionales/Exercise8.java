package ejercicios2_2SentenciasCondicionales;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		new Exercise8().show();

	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		Double price, distance;
		Integer day;
		System.out.println("Inserte la cantidad de kilómetros recorridos (1 decimal): ");
		distance = keyboard.nextDouble();
		System.out.println("Inserte el número de días de estancia: ");
		day = keyboard.nextInt();
		if (distance > 1000.0 && day > 7) {
			price = (distance * 0.35) * 0.3;
			System.out.println("El precio total es: " + price);
		} else {
			price = distance * 0.35;
			System.out.println("El precio total es: " + price);
		}
	}
}
