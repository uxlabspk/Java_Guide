package Generics.ExtendingGenerics;

// abstract generic class
public abstract class AbstractClass<T> {
    private T value;

    // getter method
    public T getValue() {
        return this.value;
    }

    // setter method
    public void setValue(T value) {
        this.value = value;
    }
}
