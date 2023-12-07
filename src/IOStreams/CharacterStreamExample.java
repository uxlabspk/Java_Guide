package IOStreams;

// Character Stream Example.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
    // main driven method
    public static void main(String[] args) throws IOException {
        // creating FileReader, FileWriter object.
        FileReader freader = null;
        FileWriter fwriter = null;

        // try-catch block
        try {
            // loading file path.
            freader = new FileReader("./samp1.txt");
            fwriter = new FileWriter("./samp2.txt");

            // loop to read all data from the file.
            int content = 0;
            while ((content = freader.read()) != -1) {
                // writing all data to another file
                fwriter.write((char) content);
            }

        } catch (Exception e) {
            // exception details
            e.printStackTrace();
        } finally {
            // if streams are open then close them.
            if (freader != null && fwriter != null) {
                freader.close();
                fwriter.close();
            }
        }
    }
}