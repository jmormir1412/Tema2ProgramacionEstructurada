package ejercicios2_2SentenciasCondicionales;

import java.util.*;

public class Exercise9 {

	public static void main(String[] args) {
		new Exercise9().show();

	}

	@SuppressWarnings("resource")
	public void show() {
		Scanner keyboard = new Scanner(System.in);
		Random random = new Random();
		String chain;
		Character character;
		Integer random1, count;
		System.out.println("Introduce una cadena: ");
		chain = keyboard.nextLine();
		count = chain.length();
		random1 = random.nextInt(count);
		character = chain.charAt(random1);
		System.out.println("El caracter resultante es: " + character);

	}
}
