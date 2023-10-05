import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		int menuOption = -1;
		while (menuOption != 0) {
			MenuUtil.printMenuToConsole();
			try {
				menuOption = Integer.parseInt(br.readLine().trim());
				switch (menuOption) {
					case 1:
						firstTask();
						break;
					case 2:
						secondTask();
						break;
					case 3:
						thirdTask();
						break;
					case 4:
						forthTask();
						break;
				}
			} catch (IOException e) {
				System.out.println("Неверно введено число, попробуйте снова.");
			} catch (NumberFormatException e) {
				System.out.println("Необходимо ввести число");
			}
		}
	}

	private static void forthTask() {
		System.out.println("Введите скобочную последовательность:");
		try {
			String input = br.readLine().trim();
			if(BracketsChecker.isCorrect(input)) System.out.println("Исходная последовательность корректная");
			else System.out.println("Исходная последовательность некорректная");
		} catch (IOException e) {
			System.out.println("Ошибка при вводе скобочной последовательности, попробуйте снова");
			forthTask();
		}
	}

	private static void firstTask() {
		System.out.println("Введите число:");
		try {
			int digit = Integer.parseInt(br.readLine().trim());
			if (digit > 7) System.out.println("Привет");
		} catch (IOException e) {
			System.out.println("Ошибка при вводе числа, попробуйте снова");
			firstTask();
		}
	}

	private static void secondTask() {
		System.out.println("Введите имя:");
		try {
			String name = br.readLine().trim();
			if (name.equals("Вячеслав")) System.out.println("Привет, Вячеслав");
			else System.out.println("Нет такого имени");
		} catch (IOException e) {
			System.out.println("Ошибка при вводе имени, попробуйте снова");
			secondTask();
		}
	}

	private static void thirdTask() {
		System.out.println("Введите массив через пробел:");
		try {
			StringTokenizer st = new StringTokenizer(br.readLine().trim());

			int[] a = new int[st.countTokens()];

			int i = 0;
			while (st.hasMoreTokens()) {
				a[i] = Integer.parseInt(st.nextToken());
				i++;
			}
			System.out.println("Элементы, кратные 3:");
			for (int j: a) {
				if(j%3==0 && j!=0) System.out.print(j+" ");
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println("Ошибка при вводе массива, попробуйте снова");
			thirdTask();
		}
	}



}
