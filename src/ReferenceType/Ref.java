package ReferenceType;
import java.awt.Point;

public class Ref {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = p1;
        // once the x of p1 is modified, x of p2 will also change.
        p1.x = 34;

        System.out.println(p1);
        System.out.println(p2);
    }
}