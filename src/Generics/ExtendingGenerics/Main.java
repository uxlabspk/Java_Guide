package Generics.ExtendingGenerics;

// main class
public class Main {
    // main driven function
    public static void main(String[] args) {
        // creating email class reference
        Email userEmail = new Email();
        userEmail.setValue("naveed@example.com");
        System.out.println(userEmail.getValue());

        // creating age class reference
        Age userAge = new Age();
        userAge.setValue(Integer.valueOf(21));
        System.out.println(userAge.getValue());

        // creating height class reference
        Height<Integer> userHeight_cm = new Height<>();
        userHeight_cm.setValue(Integer.valueOf(172)); // 172cm
        System.out.println(userHeight_cm.getValue());

        // again creating height class object using float type
        Height<Float> userHeight_feet = new Height<>();
        userHeight_feet.setValue(Float.valueOf(5.7F)); // 5.7Feet
        System.out.println(userHeight_feet.getValue());
    }
}