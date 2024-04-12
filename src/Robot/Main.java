package Robot;

import java.util.ArrayList;
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
                Direction = "Up";
                if (X2 > X1) {
                    //robot1.turnRight();
                    Direction = "Right";
                    do {
                        X1 = X1 + 1;
                    }
                    while (X1!=X2);

                    if (Y2>Y1) {
                        //robot1.turnLeft();
                        Direction = "Up";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                    else {
                        //robot1.turnRight();
                        Direction = "Down";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                }
                if (X2 < X1) {
                    //robot1.turnLeft();
                    Direction = "Left";
                    do {
                        X1=X1 + 1;
                    }
                    while (X1!=X2);

                    if (Y2>Y1) {
                        //robot1.turnRight();
                        Direction = "Up";
                        do {
                            Y1=Y1+1;
                        }
                        while (Y1!=Y2);
                    }
                    else {
                        //robot1.turnLeft();
                        Direction = "Down";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                }
            }
            if (Direction.equals("Down")){
                Direction = "Down";
                if (X2 > X1) {
                    //robot1.turnLeft();
                    Direction = "Left";
                    do {
                        X1 = X1 + 1;
                    }
                    while (X1!=X2);

                    if (Y2>Y1) {
                        //robot1.turnLeft();
                        Direction = "Up";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                    else {
                        //robot1.turnRight();
                        Direction = "Down";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                }
                if (X2 < X1) {
                    //robot1.turnRight();
                    Direction = "Right";
                    do {
                        X1=X1 + 1;
                    }
                    while (X1!=X2);

                    if (Y2>Y1) {
                        //robot1.turnRight();
                        Direction = "Up";
                        do {
                            Y1=Y1+1;
                        }
                        while (Y1!=Y2);
                    }
                    else {
                        //robot1.turnLeft();
                        Direction = "Down";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                }
            }
            if (Direction.equals("Right")){
                Direction = "Right";
                if (X2 > X1) {
                    do {
                        X1 = X1 + 1;
                    }
                    while (X1!=X2);

                    if (Y2>Y1) {
                        //robot1.turnLeft();
                        Direction = "Up";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                    else {
                        //robot1.turnRight();
                        Direction = "Down";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                }
                if (X2 < X1) {
                    //robot1.turnLeft();
                    //robot1.turnLeft();
                    Direction = "Left";
                    do {
                        X1=X1 + 1;
                    }
                    while (X1!=X2);

                    if (Y2>Y1) {
                        //robot1.turnRight();
                        Direction = "Up";
                        do {
                            Y1=Y1+1;
                        }
                        while (Y1!=Y2);
                    }
                    else {
                        //robot1.turnLeft();
                        Direction = "Down";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                }
            }
            if (Direction.equals("Left")){
                Direction = "Left";
                if (X2 > X1) {
                    //robot1.turnRight();
                    //robot1.turnRight();
                    Direction = "Right";
                    do {
                        X1 = X1 + 1;
                    }
                    while (X1!=X2);

                    if (Y2>Y1) {
                        //.turnLeft();
                        Direction = "Up";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                    else {
                        //robot1.turnRight();
                        Direction = "Down";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                }
                if (X2 < X1) {
                    do {
                        X1=X1 + 1;
                    }
                    while (X1!=X2);

                    if (Y2>Y1) {
                        //robot1.turnRight();
                        Direction = "Up";
                        do {
                            Y1=Y1+1;
                        }
                        while (Y1!=Y2);
                    }
                    else {
                        //robot1.turnLeft();
                        Direction = "Down";
                        do {
                            Y1 = Y1 + 1;
                        }
                        while (Y1!=Y2);
                    }
                }
            }
            Robot robot2 = new Robot(X1, Y1, Direction);

            System.out.println(robot2.getX1());
            System.out.println(robot2.getY1());
            System.out.println(robot2.getDirection());
        }
    }
}
