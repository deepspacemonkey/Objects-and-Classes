import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;

public class StudentFile {
    private File file;

    public StudentFile(String filename) {
        setFile(filename);
    }

    public void setFile(String filename) {
        file = new File(filename);
    }

    public File getFile() {
        return file;
    }

    public StudentList readTextFile() throws FileNotFoundException,
            ParseException {
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
                if (token.length != 7)
                    throw new ParseException("Data format is incorrect", 7);
                studentList.add(new Student(token[2].trim(), Integer.parseInt(token[1].trim()), token[3].trim(), Integer.parseInt(token[0].trim()), new MyDate(Integer.parseInt(token[4].trim()), Integer.parseInt(token[5].trim()), Integer.parseInt(token[6].trim()))));
            }
        } finally {
            reader.close();
        }
        return studentList;
    }

    public StudentList readTextFile(String filename)
            throws FileNotFoundException, ParseException {
        setFile(filename);
        return readTextFile();
    }

    public void writeTextFile(StudentList students)
            throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("StudentsOut.txt");
        students.sortByName();
        for (int i = 1; i < students.size(); i++) {
            Student student = students.get(i);
            writer.println(String.format("%d, %d, %s, %s, %s", student.getGroupNumber(), student.getStudyNumber(), student.getName(), student.getNationality(), student.getBirthday()));
            writer.flush();
        }
        writer.close();
    }

    public void writeGroupFiles(StudentList students)
            throws FileNotFoundException {
        PrintWriter writer = null;
        students.sortByGroup();
        for (int i = 1; i <= students.get(students.size() - 1).getGroupNumber(); i++) {
            writer = new PrintWriter(String.format("Group%d.txt", i));
            for (int j = 0; j < students.getByGroup(i).size(); j++) {
                Student student = students.getByGroup(i).get(j);
                writer.println(String.format("%d, %d, %s, %s, %s", student.getGroupNumber(), student.getStudyNumber(), student.getName(), student.getNationality(), student.getBirthday()));
                writer.flush();
            }
        }
        writer.close();
    }

    public void writeTextFile(StudentList students, String filename)
            throws FileNotFoundException {
        setFile(filename);
        writeTextFile(students);
    }

    public void writeBinaryFile(StudentList list) throws IOException {
        // TODO: Implement this method
    }

    public void writeBinaryFile(StudentList list, String filename)
            throws IOException {
        setFile(filename);
        writeBinaryFile(list);
    }

    public StudentList readBinaryFile() throws IOException,
            ClassNotFoundException {
        // TODO: Implement this method
        return null;
    }

    public StudentList readBinaryFile(String filename) throws IOException,
            ClassNotFoundException {
        setFile(filename);
        return readBinaryFile();
    }

}
