package by.htp.les05.main;

import java.util.*;

public class Task4_2 {

	public static void main(String[] args) {

		int n = 5;
		int[][] mas = new int[n][n];
		byte change = 0;
		int rowcol;

		Init(mas);
		Print(mas);

		System.out.println("----------");
		System.out.println("1. Строка");
		System.out.println("2. Столбец");
		System.out.println("0. Выход");
		System.out.println("----------");

		Scanner sc = new Scanner(System.in);
		System.out.print("Выберите подпункт: ");
		while (!sc.hasNextByte()) {
			System.out.println("Введено некорректное значение. Повторите ввод.");
			sc = new Scanner(System.in);
			System.out.print("Выберите подпункт: ");
		}
		change = sc.nextByte();

		switch (change) {
		case 1: // Выбор строки
			System.out.print("Введите номер строки: ");
			while (!sc.hasNextInt()) {
				System.out.println("Введено некорректное значение. Повторите ввод.");
				sc = new Scanner(System.in);
				System.out.print("Введите номер строки: ");
			}
			rowcol = sc.nextInt();
			
			//Проверка значения номера строки
			if(rowcol > n || rowcol <= 0) {
				System.out.println("Нет строки с номером " + rowcol);
				break;
			}

			System.out.print("\nСтрока " + rowcol + ": ");
			for(int j = 0; j < n; j++) {
				System.out.print(mas[rowcol - 1][j] + "  ");
			}
			
			break;

		case 2:
			// Выбор столбца
			System.out.print("Введите номер столбца: ");
			while (!sc.hasNextInt()) {
				System.out.println("Введено некорректное значение. Повторите ввод.");
				sc = new Scanner(System.in);
				System.out.print("Введите номер столбца: ");
			}
			rowcol = sc.nextInt();
			
			//Проверка значения номера столбца
			if(rowcol > n || rowcol <= 0) {
				System.out.println("Нет столбца с номером " + rowcol);
				break;
			}
			
			System.out.print("\nСтолбец " + rowcol + ": ");
			for(int i = 0; i < n; i++) {
				System.out.print(mas[i][rowcol - 1] + "  ");
			}
			
			break;

		default:
			System.out.println("Выход.");
			break;
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
