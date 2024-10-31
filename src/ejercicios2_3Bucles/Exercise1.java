package ejercicios2_3Bucles;

import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {
		new Exercise1().show();
	}

	public void show() {
		Random random = new Random();
		Integer num;

		while ((num = random.nextInt(1000) + 1) % 9 != 0) {

			System.out.println(num);
		}
	}
}
