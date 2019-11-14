import java.io.*;
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
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fos);
        out.writeObject(list);
        out.flush();
        out.close();
    }

    public void writeBinaryFile(StudentList list, String filename)
            throws IOException {
        setFile(filename);
        writeBinaryFile(list);
    }

    public StudentList readBinaryFile() throws IOException,
            ClassNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fis);
        StudentList data = (StudentList) in.readObject();
        in.close();
        return data;
    }

    public StudentList readBinaryFile(String filename) throws IOException,
            ClassNotFoundException {
        setFile(filename);
        return readBinaryFile();
    }

}
