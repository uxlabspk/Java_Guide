package Enumerations;

public class Main {
    public static void main(String[] args) {
        Days day = Days.WED;

        // Here we are only printing the enum field name and value.
        // name → WED
        // value → Wednesday
        System.out.println(day.name());
        System.out.println(day.getValue());

        // iterating over the enum.
        // here one thing to notice is `values()` method is static. so, we are
        // calling `values()` method as Days.values()
        // not like creating the reference first such as:
        // Days days = Days.WED
        // for (Days day : days.values()) → here we get warning.
        for (Days days : Days.values()) {
            System.out.println(days.name() + "\t" + days.getValue());
        }
    }
}
