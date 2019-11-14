import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class tester {
    public static void main(String[] args) {
        StudentFile file = new StudentFile("Students.txt");
        StudentList students = null;
        try {
            students = file.readTextFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Data incomplete/wrong");
        }
        if (students != null) {
            //System.out.println(students);
            try {
                file.writeTextFile(students);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            /*try {
                file.writeGroupFiles(students);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }*/
        }
        try {
            file.writeBinaryFile(students, "students.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(file.readBinaryFile("students.bin"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
