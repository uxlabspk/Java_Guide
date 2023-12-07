package TernaryOperator;

public class Elvis {
    public static int checkMax(int first, int second) {
        return ((first > second) ? first : second);
    }

    public static void main(String[] args) {
        System.out.println(checkMax(23, 43));
    }
}