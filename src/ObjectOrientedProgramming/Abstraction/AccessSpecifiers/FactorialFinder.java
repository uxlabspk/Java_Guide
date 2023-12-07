package ObjectOrientedProgramming.Abstraction.AccessSpecifiers;

class FactorialFinder {
    // private fields.
    private long factorial;
    private final int number;

    // parametrized constructor.
    public FactorialFinder(int number) {
        factorial = 1;
        this.number = number;
    }

    // factorial method.
    public void factorial() {
        // here the user is not concerned with isValid() method.
        if (isValid(number)) {
            for (int i = number; i > 0; i--) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Can't determine the factorial of negative number.");
        }
    }

    // validation checker method.
    private boolean isValid(int number) {
        return (number > 0);
    }
}
