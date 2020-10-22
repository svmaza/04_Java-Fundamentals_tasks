package by.htp.les05.main;

import java.util.*;

public class Task4_8 {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		// Ввод порядка матрицы
		System.out.print("Введите порядок матрицы (чётное): ");
		while (!sc.hasNextInt()) {
			System.out.println("Введено некорректное значение. Повторите ввод.");
			sc = new Scanner(System.in);
			System.out.print("\nВведите порядок матрицы (чётное): ");
		}
		n = Math.abs(sc.nextInt());

		if (n % 2 == 0) {

			// Объявление, инициализация и вывод массива
			int[][] mas = new int[n][n];

			// Заполнение массива данными
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < (n - i); j++) {
					mas[i][j] = i + (j + 1);
				}
			}

			System.out.println();
			// Вывод на консоль
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.printf("%4d ", mas[i][j]);
				}
				System.out.println("\n");
			}
		} else {
			System.out.println("Введено нечётное число.");
		}
	}
}
