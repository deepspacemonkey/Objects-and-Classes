public class Grade {
    private String courseName;
    private int grade;

    public Grade(String courseName, int grade){
        if(!isLegalGrade(grade))
            throw new IllegalArgumentException("Grade is not a valid grade");
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    private boolean isLegalGrade(int grade) {
        return grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12;
    }

    public String toString() {
        return String.format("%s: %d", courseName, grade);
    }
}
