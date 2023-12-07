package ObjectOrientedProgramming.Inheritance;

public class Animal {
    private int legs;
    private String color;
    private boolean vegetarian;

    Animal() {
        legs = 0;
        color = "";
        vegetarian = false;
    }

    Animal(int legs, String color, boolean vegetarian) {
        this.legs = legs;
        this.color = color;
        this.vegetarian = vegetarian;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}
