package Zombie;
import java.util.Objects;
public class Zombie {
    private double distation;
    private int colvoZombie;
    private int colvoPatronov;

    @Override
    public String toString() {
        return "Zombie{" +
                "distation=" + distation +
                ", colvoZombie=" + colvoZombie +
                ", colvoPatronov=" + colvoPatronov +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zombie zombie = (Zombie) o;
        return distation == zombie.distation && colvoZombie == zombie.colvoZombie && colvoPatronov == zombie.colvoPatronov;
    }

    @Override
    public int hashCode() {
        return Objects.hash(distation, colvoZombie, colvoPatronov);
    }

    public Zombie(double distation, int colvoZombie, int colvoPatronov) {
        this.distation = (double) distation;
        this.colvoZombie = colvoZombie;
        this.colvoPatronov = colvoPatronov;
    }
    public double getDistation() {
        return distation;
    }

    public int getColvoZombie() {
        return colvoZombie;
    }

    public int getColvoPatronov() {return colvoPatronov;}
}
