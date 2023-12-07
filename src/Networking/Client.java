package Networking;

// Complete Client Example.
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Client {
    // main driven method
    public static void main(String[] args) {
        // "try-with-resources" will close the socket once we leave its scope.
        try(Socket socket = new Socket("127.0.0.1", 12345)) {
            // Writing bytes to the socket.
            OutputStream out = socket.getOutputStream();
            // wrap the OutputStream in a writer to write a String instead of bytes.
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(out, StandardCharsets.UTF_8));
            // Writing message to the socket.
            writer.println("Hi, Server from client");
            writer.flush();
        } catch (Exception e) {
            // Exception => the mother of all exceptions.
            e.printStackTrace();
        }
    }
}