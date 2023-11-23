
public class RegisteredCourse {

    private Course course;
    private int semester;
    private String grade;

    public RegisteredCourse(Course course, int semester) {
        this.course = course;
        this.semester = semester;
        this.grade = "NA";
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return course.toString()+":"+semester;
    }
    
    

}
