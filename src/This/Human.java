package This;

public class Human {
    private String name;
    private int age;
    private float height;

    // Parametrized constructor.
    Human(String name, int age) {
        // here this.name clarify that name is field name (left hand side)
        this.name = name;
        this.age = age;
    }

    // Overloaded parametrized constructor.
    Human(String name, int age, float height) {
        // By using the ‘this’ keyword we can call the overloaded constructor.
        this(name, age);
        this.height = height;
    }

    // setter method.
    public void setHeight(float height) {
        this.height = height;
    }

    // Details showing method
    public void showDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Height : " + this.height + "m");
    }

    // main driven function.
    public static void main(String[] args) {
        var M = new Human("Naveed", 92);
        var N = new Human("Naveed", 92, 1.91f);

        M.setHeight(1.71f);

        M.showDetails();
        N.showDetails();
    }
}