package Annotations.Deprecated;

public class Cat extends Animal{
    @Override
    void voice() {
        System.out.println("Meow");
    }

    // here, getCatName method cause the compile warning.
    // shown in the output image.
    @Deprecated
    public String getCatName() {
        return "Kattie";
    }
}
