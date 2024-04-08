import java.util.Scanner;
public class Summa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму всех страниц");
        int sum = sc.nextInt();
        if (sum >= 0) {
            int a1 = 1;
            int d = 1;
            int a = d;
            int b = 2*a1-d;
            int c = -2*sum;
            int D = (b*b-4*a*c);
            Double corenD = Math.pow(D, 0.5);
            Double n1 = ( (-1*b + corenD)/(2*a));
            Double n2 = ( (-1*b - corenD)/(2*a));
            int x1 = n1.intValue();
            int x2 = n2.intValue();
            if (x1>=0){
                System.out.println(x1);
            }
            if (x2>=0){
                System.out.println(x2);
            }
        }
        else {
            System.out.println("Сумма страниц не может быть отрицательной, введите сумму заново");
        }
    }
}
