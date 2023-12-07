package Synchronization;

import java.text.MessageFormat;

// multiply class
public class Multiple {
    // public method to print the table.
    synchronized public void Multiply(int number) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(MessageFormat.format("{0} x {1} = {2}", number, i, (number * i	)));
        }
    }
}