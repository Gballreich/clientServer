import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client test");

        final int TEST_PORT = 1234;
        try (Socket s = new Socket("localhost", TEST_PORT)) {
            InputStream instream = s.getInputStream();
            OutputStream outstream = s.getOutputStream();
            Scanner in = new Scanner(instream);
            PrintWriter out = new PrintWriter(outstream);
           //sout please enter an equation
           //get user input of an equation send as command
           // Scanner user = new Scanner(System.in);
            String command = "100 - 2";
            System.out.println("Sending: " + command);
            out.print(command + "\n");
            out.flush();

            int answer = in.nextInt();
            System.out.println("Answer: " + answer);
        }

    }
}