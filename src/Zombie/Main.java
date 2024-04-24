package Zombie;
import Robot.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Для начала игры нажмите 1");
        Scanner sc = new Scanner(System.in);
        String scnr = sc.nextLine();
        if (scnr.equals("1")) {
            System.out.println("Введите начальное растояние");
            double distation = Integer.parseInt(sc.next());
            System.out.println("Введите количество зомби");
            int colvoZombie = Integer.parseInt(sc.next());
            System.out.println("Введите начальное количество патронов");
            int colvoPatronov = Integer.parseInt(sc.next());
            Zombie zombies = new Zombie(distation, colvoZombie, colvoPatronov);

            while (true){
                colvoPatronov--;
                colvoZombie--;
                distation = distation - 0.5;
                if (distation == 0) {
                    if ((colvoPatronov == 0) &&(colvoZombie==0)) {
                        System.out.println("Вы застрелили " + zombies.getColvoZombie() + " зомби");
                        break;
                    }
                    else {
                        System.out.println("Вы застрелили " + (zombies.getColvoZombie() - colvoZombie) +
                                " зомби, прежде чем вас съели: поражены");
                    }
                    break;
                }
                if (colvoPatronov == 0) {
                    if (colvoPatronov < colvoZombie) {
                        System.out.println("Вы застрелили " + (zombies.getColvoZombie() - colvoZombie) +
                                " зомби, прежде чем вас съели: кончились патроны" );
                    }
                    if (colvoPatronov == colvoZombie) {
                        System.out.println("Вы застрелили " + zombies.getColvoZombie() + " зомби");
                    }
                    break;
                }
                if (colvoZombie == 0) {
                    System.out.println("Вы застрелили " + zombies.getColvoZombie() + " зомби");
                    break;
                }
            }
        }
    }
}
