import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        System.out.print("Type filename:");
        Scanner keyboard = new Scanner(System.in);
        String filename = keyboard.nextLine();

        File file = new File(filename);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        boolean isRunning = true;
        do {
            System.out.print("Type name of friend: ");
            String input = keyboard.nextLine();
            if (input.equals("QUIT"))
                isRunning = false;
            else {
                writer.println(input);
            }
        } while (isRunning);
        writer.close();
        keyboard.close();
    }
}
