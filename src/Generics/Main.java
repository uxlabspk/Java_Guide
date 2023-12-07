package Generics;

public class Main {
    public static void main(String[] args) {
        Example<Integer> iValue = new Example<>();
        Example<Float> fValue = new Example<>();
        Example<Double> dValue = new Example<>();
        Example<String> sValue = new Example<>();
        Example<Character> cValue = new Example<>();

        // compiler perform autoboxing form primitive to wrapper classes.
        iValue.setObj(1);
        fValue.setObj(1.2F);
        dValue.setObj(3.43);
        sValue.setObj("uxlabspk");
        cValue.setObj('A');

        System.out.println(iValue.getObj());
        System.out.println(fValue.getObj());
        System.out.println(dValue.getObj());
        System.out.println(sValue.getObj());
        System.out.println(cValue.getObj());
    }
}