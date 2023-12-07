package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        String fileName = "time.ser";
        SerialClass time = new SerialClass();

        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
            output.writeObject(time);
            output.close();
        } catch(IOException exception) {
            exception.printStackTrace();
        }
    }
}