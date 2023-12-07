package IOStreams;

// Byte Stream Example.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
    // main driven method
    public static void main(String[] args) throws IOException {
        // Input stream object.
        FileInputStream inStream = null;
        // Output stream object.
        FileOutputStream outStream = null;

        // try-catch block
        try {
            // loading file path.
            inStream = new FileInputStream("samp1.txt");
            outStream = new FileOutputStream("samp2.txt");

            // loop to read all data from the file.
            int content = 0;
            while ((content = inStream.read()) != -1) {
                // writing all data to another file
                outStream.write((byte) content);
            }
        } catch (Exception e) {
            // exception details
            e.printStackTrace();
        } finally {
            // if streams are open then close them.
            if (inStream != null && outStream != null) {
                inStream.close();
                outStream.close();
            }
        }
    }
}