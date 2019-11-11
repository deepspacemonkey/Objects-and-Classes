import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PoorFileReader
{

   public void openFile(String filename) throws FileNotFoundException
   {
      File file = new File(filename + ".txt");
      Scanner scanner = new Scanner(file);
      scanner.close();
   }

}