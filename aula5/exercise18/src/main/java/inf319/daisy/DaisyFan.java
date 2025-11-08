package inf319.daisy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaisyFan {

    private static Daisy daisy = new Daisy();

    public static void main(String[] args) throws IOException {

        BufferedReader terminal = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Fan is: " + daisy.getState().toString());

        while (true) {
            System.out.println("Pull it?");
            String command = null;
            try {
                command = terminal.readLine();
            } catch (IOException e) { e.printStackTrace(); }
            if (command.length() != 0) System.exit(0);
            daisy.pull();
            System.out.println("Fan is: " + daisy.getState().toString());
        }
    }


}
