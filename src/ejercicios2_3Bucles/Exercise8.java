package ejercicios2_3Bucles;

import java.util.Random;

public class Exercise8 {

	public static void main(String[] args) {
		new Exercise8().show();
	}

	public void show() {
		Random random = new Random();
		int num;
		for (int i = 1; i <= 20; i++) {
			num = random.nextInt(6) + 1;
			System.out.printf("Ha tirado %d veces el dado, el resultado actual es %d\n", i, num);

		}
	}
}
