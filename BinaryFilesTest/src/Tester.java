import java.io.*;
import java.util.ArrayList;

public class Tester {

    public static void write(String filename, Object object) {
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
            out.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object read(String filename){
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
        Object data = null;
        try {
            data = (Object) in.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void main(String[] args) {
//        Student student1 = new Student("student1", "001");
//        Student student2 = new Student("student2", "002");
//        Student student3 = new Student("student3", "003");
//        Student student4 = new Student("student4", "004");
//        Student student5 = new Student("student5", "005");
//        Student student6 = new Student("student6", "006");
//
//        Container data = new Container();
//        data.students = new ArrayList<Student>();
//        data.students.add(student1);
//        data.students.add(student2);
//        data.students.add(student3);
//        data.students.add(student4);
//        data.students.add(student5);
//        data.students.add(student6);
//
//        data.studentList = new StudentList(data.students);
//
//        data.course = new Course("SDJ", data.students, "ASDF");
//
//        data.exam = new Exam("SDJ Exam", data.course);
//
//        System.out.println(data.course);
//        System.out.println(data.exam.getCourse());
//
//        System.out.println(data.exam.getCourse().getStudents());
//        System.out.println(data.students);
//        System.out.println(data.course.getStudents());
//
//        write("data.bin", data);



        Container data = (Container) read("data.bin");

        System.out.println(data.course);
        System.out.println(data.exam.getCourse());

        System.out.println(data.exam.getCourse().getStudents());
        System.out.println(data.students);
        System.out.println(data.course.getStudents());
    }
}
