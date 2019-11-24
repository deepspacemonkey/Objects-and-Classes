import java.io.Serializable;
import java.util.ArrayList;

public class StudentList implements Serializable {
    private ArrayList<Student> students;

    public StudentList(){
        students = null;
    }
    public StudentList(ArrayList<Student> students){
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
