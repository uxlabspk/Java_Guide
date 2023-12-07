package ExceptionHandling;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "the last of us";

        try {
            System.out.print("Enter the index : ");
            System.out.println(str.charAt(scanner.nextInt()));
        }
        // Child exception catch block.
        catch(StringIndexOutOfBoundsException e) {
            // Print the detail information of exception.
            e.printStackTrace();
        }
        // Parent exception catch block.
        // Mother of all exceptions.
        catch (Exception e) {
            // Print the detail information of exception.
            e.printStackTrace();
        }
        // finally close the open resources
        finally {
            scanner.close();
        }
    }
}