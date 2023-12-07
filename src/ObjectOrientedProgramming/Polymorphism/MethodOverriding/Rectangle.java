package ObjectOrientedProgramming.Polymorphism.MethodOverriding;

public class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // See this annotation @Override, it is telling that this method is from
    // parent class Shape and is overridden here.
    @Override
    public double area() {
        return length * width;
    }
}