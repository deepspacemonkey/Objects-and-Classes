import java.io.Serializable;

public class Exam implements Serializable {
    public String name;
    public Course course;

    public Exam(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }
}
