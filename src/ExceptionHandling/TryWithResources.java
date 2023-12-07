package ExceptionHandling;

import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter denominator : ");
            int denominator = s.nextInt();
            System.out.println(5 / denominator);
        } catch(ArithmeticException e) {
            System.out.println("Can't divide by zero");
        } catch (Exception e) {
            System.out.println("Unknown error occur! ");
        }
    }
}