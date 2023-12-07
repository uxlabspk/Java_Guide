package Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        // Creating an array
        int[] myArray = new int[3];

        // Storing the values
        myArray[0] = 33;
        myArray[1] = 23;
        myArray[2] = 21;

        // Printing the vales.
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
