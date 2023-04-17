package AdvancedEx9;

public class Rectangle extends Shape{


    @Override
    double calculateArea(double height) {
        return Math.PI * Math.pow((height / 2), 2);
    }
}
