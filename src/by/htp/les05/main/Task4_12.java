package by.htp.les05.main;

import java.util.*;

public class Task4_12 {

	public static void main(String[] args) {

		int n;
		int m;
		int tmp;

		// Генерация случайного количества строк и столбцов матрицы
		Random rand = new Random();
		int a = 3;
		int b = 6;
		n = a + rand.nextInt(b - a + 1);
		m = a + rand.nextInt(b - a + 1);

		if(m > n) {
			tmp = n;
			n = m;
			m = tmp;
		}
		
		int[][] mas = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = (m - 1); j >= i; j--) {
				mas[i][j] = 1;
			}
		}
		
		System.out.println("Случайная матрица размером " + n + " x " + m + ":\n");
		Print(mas);
		System.out.println("Количество единиц в столбце соответствует номеру столбца.");
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
}
