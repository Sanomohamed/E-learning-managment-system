
import java.util.ArrayList;
import java.util.List;

public class Student extends User {

    private String contactNumber;
    private String username;
    private String password;
    private List<RegisteredCourse> courses;

    // Constructor
    public Student(String name, String icNumber, String permanentAddress, String contactNumber, String username, String password) {
        super(name, icNumber, permanentAddress);
        this.contactNumber = contactNumber;
        this.username = username;
        this.password = password;
        this.courses = new ArrayList<>();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean registerCourse(Course course, int semester) {
        System.out.println(course);
        if (getCourses(course.getCode(), semester) != null) {
            return false;
        }
        courses.add(new RegisteredCourse(course, semester));
        return true;
    }

    public RegisteredCourse getCourses(String code, int semester) {
        for (RegisteredCourse c : courses) {
            if (c.getCourse().getCode().equals(code)
                    && semester == c.getSemester()) {
                return c;
            }
        }
        return null;
    }

    public List<RegisteredCourse> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return username + ":" + getName();
    }

}
