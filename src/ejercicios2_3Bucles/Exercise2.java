package ejercicios2_3Bucles;

import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {
		new Exercise2().show();
	}

	public void show() {
		Random random = new Random();
		Integer num;
		boolean exit;
		do {
			num = random.nextInt(1000) + 1;
			System.out.println(num);
			exit = (num % 9 == 0);

		} while (!exit);

	}
}
