package DeSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// importing the class from Serialization package.
import Serialization.SerialClass;

public class DeserializationClassExample {
    public static void main(String[] args) {
        String fileName = "time.ser";
        SerialClass time = null;

        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
            time = (SerialClass) input.readObject();
            input.close();
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }

        System.out.println("Restored time : " + time.getCurrentTime());
    }
}