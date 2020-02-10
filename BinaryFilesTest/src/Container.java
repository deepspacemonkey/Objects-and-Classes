import pack.Course;

import java.io.Serializable;
import java.util.ArrayList;

public class Container implements Serializable {
    StudentList studentList;
    ArrayList<Student> students;
    Exam exam;
}
