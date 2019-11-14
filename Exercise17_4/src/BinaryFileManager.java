import java.io.*;
import java.util.Scanner;

public class BinaryFileManager implements StoreStuff{
    public void load() {
        System.out.print("Type filename:");
        Scanner keyboard = new Scanner(System.in);
        String filename = keyboard.nextLine();

        File file = new File(filename);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int numberOfFriends = 0;

        try {
            numberOfFriends = in.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < numberOfFriends; i++) {
            try {
                System.out.println(in.readUTF());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        keyboard.close();
    }

    public void save() {
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
