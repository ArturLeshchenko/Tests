package Robot;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Для начала игры нажмите 1");
        Scanner sc = new Scanner(System.in);
        String scnr = sc.nextLine();




        if (scnr.equals("1")) {
            System.out.println("Введите начальные координаты");
            int X1 = Integer.parseInt(sc.next());
            int Y1 = Integer.parseInt(sc.next());
            System.out.println("Введите начальное направление робота");
            String Direction = sc.next();
            System.out.println("Введите конечные координаты");
            int X2 = Integer.parseInt(sc.next());
            int Y2 = Integer.parseInt(sc.next());
            Robot robot1 = new Robot(X1, Y1, Direction);

            if (Direction.equals("Up")){

                if (X2 > X1) {
                    robot1.turnRight();
                    do {
                        X1 = X1 + 1;
                    }
                    while (X1!=X2);

                    if (Y2>Y1) {
                        robot1.turnLeft();
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                    else {
                        robot1.turnRight();
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                }
                else {
                    robot1.turnLeft();
                    do {
                        X1 = X1 + 1;
                    }
                    while (X1 != X2);
                }
                if (X2 < X1) {
                    robot1.turnLeft();
                    do {
                        X1=X1 + 1;
                    }
                    while (X1!=X2);

                    if (Y2>Y1) {
                        robot1.turnRight();
                        do {
                            Y1=Y1+1;
                        }
                        while (Y1!=Y2);
                    }
                    else {
                        robot1.turnLeft();
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                }
                else {
                    robot1.turnLeft();
                    do {
                        X1 = X1 + 1;
                    }
                    while (X1!= X2);
                }

            }
            if (Direction.equals("Down")){

            }
            if (Direction.equals("Right")){

            }
            if (Direction.equals("Left")){

            }


            //Robot robot2 = new Robot(X1, Y1, Direction);


            System.out.println(robot1.getX1());
            System.out.println(robot1.getY1());
            System.out.println(robot1.getDirection());
        }
    }
}
