package by.htp.les05.main;

import java.util.*;

public class Task4_5 {

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
			for (int j = 0, i = (n - 1); j < n; j++, i--) {
				mas[i][j] = i + 1;
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
