package Generics.MultiTypeGeneric;

public class Main {
    public static void main(String[] args) {
        MultiTypeClass<String, String> t = new MultiTypeClass<>("First", "Second");
        System.out.println(t.getFirstParameter());
        System.out.println(t.getSecondParameter());
    }
}
