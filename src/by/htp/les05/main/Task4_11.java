package by.htp.les05.main;

import java.util.*;

public class Task4_11 {

	public static void main(String[] args) {

		int count;
		int iCount = 0;

		int[][] mas = new int[10][20];
		Init(mas);
		System.out.println();
		Print(mas);

		System.out.print("Номера строк содержащие число 5 от трёх и более раз: ");
		for (int i = 0; i < 10; i++) {
			count = 0;
			for (int j = 0; j < 20; j++) {
				if (mas[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				iCount++;
				System.out.print((i + 1) + "; ");
			}
		}

		if (iCount == 0) {
			System.out.print("таких строк нет.");
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
		int a = 0;
		int b = 15;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = a + rand.nextInt(b - a + 1);
			}
		}
	}
}
