package AdvancedEx9;

public class Boat implements Movable{

    @Override
    public void moveForward() {
        System.out.println("The Boat is moving forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("The Boat is moving backward");

    }
}
