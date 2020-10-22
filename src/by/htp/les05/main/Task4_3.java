package by.htp.les05.main;

import java.util.*;

public class Task4_3 {

	public static void main(String[] args) {

		int n;
		int m;

		Scanner sc = new Scanner(System.in);

		// Ввод количества строк матрицы
		System.out.print("Введите количество строк матрицы: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введено некорректное значение. Повторите ввод.");
			sc = new Scanner(System.in);
			System.out.print("\nВведите количество строк матрицы: ");
		}
		n = Math.abs(sc.nextInt());

		// Ввод количества столбцов матрицы
		System.out.print("Введите количество столбцов матрицы: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введено некорректное значение. Повторите ввод.");
			sc = new Scanner(System.in);
			System.out.print("\nВведите количество столбцов матрицы: ");
		}
		m = Math.abs(sc.nextInt());

		System.out.println("\nМатрица " + n + " x " + m + ":\n");

		// Объявление и инициализация массива
		int[][] mas = new int[n][m];
		Init(mas);
		Print(mas);

		System.out.println("\nИзменённая матрица: \n");
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = (m - 1); j >= 0; j--) {
					System.out.printf("%4d ", mas[i][j]);
				}
			} else {
				for (int j = 0; j < m; j++) {
					System.out.printf("%4d ", mas[i][j]);
				}
			}
			System.out.println("\n");
		}
	}

	
	
	// Метод вывода массива на консоль
	public static void Print(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.printf("%4d ", ar[i][j]);
			}
			System.out.println("\n");
		}
	}

	// Метод инициализации массива
	public static void Init(int[][] ar) {
		Random rand = new Random();
		int a = 1;
		int b = 100;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = a + rand.nextInt(b - a + 1);
			}
		}
	}
}
