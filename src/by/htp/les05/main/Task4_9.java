package by.htp.les05.main;

import java.util.*;

public class Task4_9 {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите порядок матрицы: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введено некорректное значение. Повторите ввод.");
			sc = new Scanner(System.in);
			System.out.print("\nВведите порядок матрицы: ");
		}
		n = Math.abs(sc.nextInt());

		System.out.print("\nОдномерный массив случайных чисел: ");
		int[] arrLine = new int[n];
		Init(arrLine);
		Print(arrLine);

		System.out.println("\nМатрица порядка " + n + ": ");
		System.out.println();
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				 matrix[i][j] = (int) Math.pow(arrLine[j], i + 1); 
				 System.out.printf("[%7d]  ", matrix[i][j]);
			}
			System.out.println("\n");
		}
	}

	// Метод вывода массива на консоль
	public static void Print(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%4d ", ar[i]);
		}
	}

	// Метод инициализации массива
	public static void Init(int[] ar) {
		Random rand = new Random();
		int a = 2;
		int b = 15;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = a + rand.nextInt(b - a + 1);
		}
	}
}
