interface Movable {
    void move();
}

class Car implements Movable {
    private int speed = 60; // Example speed for Car

    public void move() {
        System.out.println("Car is moving at speed " + speed);
    }
}

class Robot implements Movable {
    private int speed = 5; // Example speed for Robot

    public void move() {
        System.out.println("Robot is walking at speed " + speed);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Movable m = new Car();
        m.move();
        m = new Robot();
        m.move();
    }
}