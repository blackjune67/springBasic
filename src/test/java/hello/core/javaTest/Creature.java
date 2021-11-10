package hello.core.javaTest;

public abstract class Creature {
    private int age;
    private int x;
    private int y;

    public Creature(int x, int y, int age) {
        this.x = x;
        this.y = y;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void age() {
        age++;
    }

    public void move(int xDistance) {
        x += xDistance;
    }

    public abstract void attack();
    public abstract void printInfo();

    @Override
    public String toString() {
        return "x : " + x + "Y : " + "age : " + age;
    }
}
