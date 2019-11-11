import java.io.FileNotFoundException;

public class tester {
    public static void main(String[] args) {
        PoorFileReader badfile = new PoorFileReader();
        try{
            badfile.openFile("test");
        }
        catch (FileNotFoundException e){
            System.out.println("File cannot be found");
        }
    }
}
