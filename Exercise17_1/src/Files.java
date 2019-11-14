import java.io.*;
import java.util.Scanner;

public class Files {
    public static void main(String[] args) {
        System.out.print("Type filename:");
        Scanner keyboard = new Scanner(System.in);
        String filename = keyboard.nextLine();

        System.out.print("Write number of friends: ");
        int numberOfFriends = keyboard.nextInt();
        keyboard.nextLine();

        File file = new File(filename);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out.writeInt(numberOfFriends);
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean isRunning = true;
        do {
            System.out.print("Type name of friend: ");
            String input = keyboard.nextLine();
            if (input.equals("QUIT"))
                isRunning = false;
            else {
                try {
                    out.writeUTF(input);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } while (isRunning);
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        keyboard.close();
    }
}
