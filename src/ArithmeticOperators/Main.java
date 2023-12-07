package ArithmeticOperators;

public class Main {
    public static void main(String[] args) {
        float num1 = 23.0F;
        float num2 = 32.0F;

        float sum, dif, mul, div, mod;

        sum = (num1 + num2);
        dif = (num1 - num2);
        mul = (num1 * num2);
        div = (num1 / num2);
        mod = (num1 % num2);

        System.out.println(sum); // 55.0
        System.out.println(dif); // -9.0
        System.out.println(mul); // 736.0
        System.out.println(div); // 0.71875
        System.out.println(mod); // 23.0
    }
}
