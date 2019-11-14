import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileManager implements StoreStuff {
    @Override
    public void load() {
        System.out.print("Type filename:");
        Scanner keyboard = new Scanner(System.in);
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner reader = null;
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(reader.hasNext()){
            System.out.println(reader.nextLine());
        }

        reader.close();
        keyboard.close();
    }

    @Override
    public void save() {
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
