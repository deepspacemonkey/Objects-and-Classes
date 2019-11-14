import java.io.*;
import java.util.Scanner;

public class getfromfile {
    public static void main(String[] args) {
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
}
