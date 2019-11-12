import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyStudentFile {
    private File file;

    public MyStudentFile(String filename) {
        file = new File(filename);
    }

    public File getFile() {
        return file;
    }

    public void setFile(String filename) {
        file = new File(filename);
    }

    public StudentList readTextFile() {
        StudentList studentList = new StudentList();
        Scanner reader = null;
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while (reader.hasNext()) {
                String line = reader.nextLine();
                String[] token = line.split(",");
                studentList.add(new Student(token[2].trim(), Integer.parseInt(token[1].trim()), token[3].trim(), Integer.parseInt(token[0].trim()), new MyDate(Integer.parseInt(token[4].trim()), Integer.parseInt(token[5].trim()), Integer.parseInt(token[6].trim()))));
            }
        }catch (NullPointerException e){
            e.getStackTrace();
        }
        return studentList;
    }

    public StudentList readTextFile(String filename) {
        StudentList studentList = new StudentList();
        File file = new File(filename);
        Scanner reader = null;
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while (reader.hasNext()) {
                String line = reader.nextLine();
                String[] token = line.split(",");
                studentList.add(new Student(token[2].trim(), Integer.parseInt(token[1].trim()), token[3].trim(), Integer.parseInt(token[0].trim()), new MyDate(Integer.parseInt(token[4].trim()), Integer.parseInt(token[5].trim()), Integer.parseInt(token[6].trim()))));
            }
        }catch (NullPointerException e){
            e.getStackTrace();
        }
        return studentList;
    }

}
