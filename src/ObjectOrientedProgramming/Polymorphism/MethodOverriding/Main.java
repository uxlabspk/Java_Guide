package ObjectOrientedProgramming.Polymorphism.MethodOverriding;

public class Main {
    public static void main(String[] args) {
        //This will create an object of circle class
        Shape circle = new Circle(5.0);
        //This will create an object of Rectangle class
        Shape rectangle = new Rectangle(5.4, 5.2);
        System.out.println("Shape of circle : " + circle.area());
        System.out.println("Shape of rectangle: " + rectangle.area());
    }
}