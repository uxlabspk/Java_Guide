package Generics;

public class GenericMethodExample {
    // here <T> is type.
    // void is return type.
    // show is name
    // arg is parameter of type T (generic)
    public <T> void show(T arg) {
        System.out.println(arg);
    }

    public static void main(String[] args) {
        GenericMethodExample g = new GenericMethodExample();
        g.show(232);
        g.show(23.2F);
        g.show("string");
        g.show('c');
    }
}