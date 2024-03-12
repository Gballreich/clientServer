import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("Server Test");
        final int TEST_PORT = 1234;
        ServerSocket server = new ServerSocket(TEST_PORT);
        System.out.println("Waiting for clients to connect...");

        while (true)
        {
            Socket s = server.accept();
            System.out.println("Client connected.");

            InputStream inStream = s.getInputStream();
            OutputStream outStream = s.getOutputStream();
            Scanner in = new Scanner(inStream);
            PrintWriter out = new PrintWriter(outStream);

            //command from client
            String equation = in.nextLine();

            if(equation.equals("$end")){
                break;
            }
            System.out.println("Equation Recieved: " + equation);
            StringTokenizer userEquation = new StringTokenizer(equation);
            int x = Integer.parseInt(userEquation.nextToken());
            String symbol = userEquation.nextToken();
            int y = Integer.parseInt(userEquation.nextToken());

            if(symbol.equals("+")){
                int answer = x + y;
                out.print(answer + "\n");
                out.flush();
                System.out.println("Answer Sent: " + answer);
            }else if(symbol.equals("-")){
                int answer = x - y;
                out.print(answer + "\n");
                out.flush();
                System.out.println("Answer Sent: " + answer);
            }else if(symbol.equals("*")){
                int answer = x * y;
                out.print(answer + "\n");
                out.flush();
                System.out.println("Answer Sent: " + answer);
            }else if(symbol.equals("/")){
                int answer = x / y;
                out.print(answer + "\n");
                out.flush();
                System.out.println("Answer Sent: " + answer);
            }
        }
    }
}
