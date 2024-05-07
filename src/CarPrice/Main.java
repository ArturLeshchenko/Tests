package CarPrice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Для начала расчетов нажмите 1");
        Scanner sc = new Scanner(System.in);
        String scnr = sc.nextLine();
        int price = 0;
        if (scnr.equals("1")) {
            System.out.println("Введите количество дней");
            int day = Integer.parseInt(sc.next());
            if ((day >= 3) && (day < 7)) {
                price = day * 40 - 20;
            }
            if (day >= 7) {
                price = day * 40 - 50;
            }
            if ((day > 0) && (day < 3)) {
                price = day * 40;
            }
            if (day <= 0) {
                System.out.println("Количесвто дней должно быть больше или равно 1");;
            }
        }
        System.out.println("Цена аренды составит " + price);
    }
}