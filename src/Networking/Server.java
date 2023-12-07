package Networking;

// Complete Server Example.
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    // main driven method
    public static void main(String[] args) {
        // "try-with-resources" will close the socket once we leave its scope.
        try (ServerSocket server = new ServerSocket(12345)) {
            while(true) {
                // waiting for clients connection.
                Socket clientSocket = server.accept();

                // creating new thread for handling the new clients
                new Thread(() -> {
                    try {
                        // reading bytes from the socket.
                        InputStream in = clientSocket.getInputStream();
                        // wrap the InputStream in a reader to read a
                        // String instead of bytes.
                        BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));

                        // reading the socket and print on the console.
                        String line = null;
                        while((line = reader.readLine()) != null) {
                            // printing to the console.
                            System.out.println(line);
                        }

                    } catch (Exception e) {
                        // Exception => the mother of all exceptions.
                        e.printStackTrace();
                    }
                }).start();
            }
        } catch (Exception e) {
            // Exception => the mother of all exceptions.
            e.printStackTrace();
        }
    }
}