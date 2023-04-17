package AdvancedEx9;

public class Car implements Movable{
    @Override
    public void moveForward() {
        System.out.println("The Car is moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The Car is moving backward");
    }
}
