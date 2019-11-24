import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable {
    private String name;
    private ArrayList<Student> students;
    private String examiner;

    public Course(String name, ArrayList<Student> students, String examiner) {
        this.name = name;
        this.students = students;
        this.examiner = examiner;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
