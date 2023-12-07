package ObjectOrientedProgramming.Polymorphism.MethodOverriding;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // See this annotation @Override, it is telling that this method is from
    // parent class Shape and is overridden here.
    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
