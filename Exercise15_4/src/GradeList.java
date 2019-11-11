public class GradeList {
    private int indexOfNextAvailableElement;
    private Grade[] grades;

    public GradeList(int numberOfGrades) {
        indexOfNextAvailableElement = 0;
        grades = new Grade[numberOfGrades];
    }

    public int getSize() {
        return indexOfNextAvailableElement+1;
    }

    public Grade getGrade(int index) {
        return grades[index];
    }

    public void addGrade(Grade grade) {
        try {
            grades[indexOfNextAvailableElement] = grade;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No more space for grades");
        }
    }

    public Grade[] getAllGrades() {
        return grades;
    }

    public double getAverage(){
        double sum = 0;
        for(Grade grade : grades){
            sum += grade.getGrade();
        }
        return sum/(indexOfNextAvailableElement+1);
    }
}
