package Generics;

// example class.
public class Example<T> {
    // obj with T return type, T is assigned in main method.
    T obj;

    // default constructor.
    public Example() {
        obj = null;
    }

    // setter method.
    public void setObj(T obj) {
        this.obj = obj;
    }

    // getter method.
    public T getObj() {
        return this.obj;
    }
}