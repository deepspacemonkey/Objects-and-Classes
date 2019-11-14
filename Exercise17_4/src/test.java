import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<StoreStuff> filemanagers = new ArrayList<StoreStuff>();
        filemanagers.add(new BinaryFileManager());
        filemanagers.add(new TextFileManager());
    }
}
