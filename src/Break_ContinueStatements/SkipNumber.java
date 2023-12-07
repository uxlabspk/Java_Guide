package Break_ContinueStatements;

public class SkipNumber {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 6)
                continue;

            System.out.print(i + " ");
        }
        System.out.println("\nSkipped 6 by using continue keyword.");
    }
}