package ObjectOrientedProgramming.Inheritance;

public class Main {
    public static void main(String[] args) {
        var kattie = new Cat(4, "White", false);

        System.out.println("Cat has " + kattie.getLegs() + " legs");
        System.out.println("Cat color is " + kattie.getColor());
        System.out.println("Is cat a vegetarian? " + kattie.isVegetarian());
    }
}
