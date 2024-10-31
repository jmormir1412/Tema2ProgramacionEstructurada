package ejercicios2_3Bucles;

import java.util.Random;

public class Exercise3 {

	public static void main(String[] args) {
		new Exercise3().show();
	}

	public void show() {
		Random random = new Random();
		Integer num, i = 1;
		boolean exit;
		do {
			num = random.nextInt(1000) + 1;
			System.out.println(num);
			i++;
			exit = (num % 9 == 0);

		} while (!exit || i < 7);
		{
			if (!exit) {
				System.out.println("No se ha encontrado el múltiplo de 9");
			}
		}
	}
}
