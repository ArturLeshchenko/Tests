package Summa;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите начальный размер массива");
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Заполните массив элементами");
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int i : numbers) {
                sum += i;
            }

            double srednee = (double) sum / n;
            System.out.println("Сумма " + sum);
            System.out.println("Среднее арифметическое " + srednee);
        }
}
