package AdvancedEx9;

public class Circle extends Shape{
    public Circle(){
        this.weight = this.width;
    }

    @Override
    double calculateArea(double height) {
        return Math.PI * Math.pow((height / 2), 2);
    }
}
