import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class getfromfile {
    public static void main(String[] args) {
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
}
