package Generics.MultiTypeGeneric;

// class with multiple parameters
public class MultiTypeClass<T, S> {
    private T firstParameter;
    private S secondParameter;

    // parametrized constructor
    public MultiTypeClass(T firstParameter, S secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    // getter method
    public T getFirstParameter() {
        return firstParameter;
    }

    // setter method
    public void setFirstParameter(T firstParameter) {
        this.firstParameter = firstParameter;
    }

    // getter method
    public S getSecondParameter() {
        return secondParameter;
    }

    // setter method
    public void setSecondParameter(S secondParameter) {
        this.secondParameter = secondParameter;
    }
}