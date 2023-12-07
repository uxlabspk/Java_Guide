package Annotations.Override;

public class Cat extends Animal{
    @Override
    void voice() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.voice();
    }
}
