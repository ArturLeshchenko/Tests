package Robot;
import java.util.Objects;
public class Robot {
    private int X1;
    private int Y1;
    private String Direction;

    @Override
    public String toString() {
        return "Robot{" +
                "X1=" + X1 +
                ", Y1=" + Y1 +
                ", Direction='" + Direction + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return X1 == robot.X1 && Y1 == robot.Y1 && Objects.equals(Direction, robot.Direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(X1, Y1, Direction);
    }

    public void setX1(int x1) {
        X1 = x1;
    }

    public void setY1(int y1) {
        Y1 = y1;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }

    public int getX1() {
        return X1;
    }

    public int getY1() {
        return Y1;
    }

    public String getDirection() {
        return Direction;
    }

    public Robot(int X1, int Y1, String Direction) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.Direction = Direction;
    }


    public void turnLeft() {
        String finalDirection = null;
        if (getDirection().equals("Up")) {
            finalDirection = ("Left");
        }
        if (getDirection().equals("Left")) {
            finalDirection = ("Down");
        }
        if (getDirection().equals("Down")) {
            finalDirection = ("Right");
        }
        if (getDirection().equals("Right")) {
            finalDirection = ("Up");
        }
        Direction = finalDirection;
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        String finalDirection = null;
        if (getDirection().equals("Up")) {
            finalDirection = ("Right");
        }
        if (getDirection().equals("Left")) {
            finalDirection = ("Up");
        }
        if (getDirection().equals("Down")) {
            finalDirection = ("left");
        }
        if (getDirection().equals("Right")) {
            finalDirection = ("Down");
        }
        Direction = finalDirection;
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        X1=X1+1;
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}
