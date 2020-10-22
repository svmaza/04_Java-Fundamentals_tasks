package by.htp.les05.main;

import java.util.*;

public class Task4_10 {

	public static void main(String[] args) {

		int n;
		int count = 0;

		// Инициализация порядка матрицы
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите порядок матрицы: ");
		while (!sc.hasNextInt()) {
			System.out.println("Введённое значение не соответствует целочисленному типу данных.");
			sc = new Scanner(System.in);
			System.out.print("Введите порядок матрицы: ");
		}
		n = sc.nextInt();

		// Инициализация массива
		int[][] mas = new int[n][n];
		Init(mas);
		System.out.println();
		Print(mas);

		// Элементы главной диагонали матрицы
		System.out.print("Положительные элементы главной диагонали матрицы: ");
		for (int i = 0; i < n; i++) {
			if (mas[i][i] > 0) {
				System.out.print(mas[i][i] + "  ");
				count++;
			}
		}
		
		if (count == 0) {
			System.out.print("все элементы отрицательные.");
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
		int a = -10;
		int b = 10;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = a + rand.nextInt(b - a + 1);
			}
		}
	}
}
