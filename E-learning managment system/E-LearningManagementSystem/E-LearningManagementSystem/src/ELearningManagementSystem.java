import java.util.ArrayList;
import java.util.List;

public class ELearningManagementSystem {

    private List<Staff> staff;
    private List<Student> students;
    private List<Program> programs;
    private List<Course> courses;
    private Student currentStudent;

    public ELearningManagementSystem() {
        staff = new ArrayList<>();
        students = new ArrayList<>();
        programs = new ArrayList<>();
        courses = new ArrayList<>();

        staff.add(new Staff("Emp1", "John", "1223435465", "8 b", "Lecturer", "Academic"));
        staff.add(new Staff("Emp2", "Smith", "1223435465", "9 b", "Lecturer", "Academic"));

        courses.add(new Course("CS001", "Computer Science", 4, "John"));
        courses.add(new Course("CS002", "Data Structures", 4, "John"));
        courses.add(new Course("SE001", "Software Engineering", 4, "Smith"));

        students.add(new Student("William", "453453", "2 b 3", "3453454", "a", "a"));
        students.add(new Student("Alen", "934848", "24 b 3", "3298904", "b", "b"));

        students.get(0).registerCourse(courses.get(0), 1);
        students.get(0).registerCourse(courses.get(2), 1);
        students.get(1).registerCourse(courses.get(0), 1);
    }

    public boolean login(String un, String pass) {
        for (Student student : students) {
            if (student.getUsername().equals(un) && student.getPassword().equals(pass)) {
                currentStudent = student;
                return true;
            }
        }
        return false;
    }

    public boolean signup(Student student) {
        if (getSudent(student.getUsername()) == null) {
            students.add(student);
            return true;
        }
        return false;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getSudent(String username) {
        for (Student student : students) {
            if (student.getUsername().equals(username)) {
                return student;
            }
        }
        return null;
    }

    public boolean addProgram(Program program) {
        if (getProgram(program.getCode()) == null) {
            programs.add(program);
            return true;
        }
        return false;
    }

    public Program getProgram(String code) {
        for (Program program : programs) {
            if (program.getCode().equals(code)) {
                return program;
            }
        }
        return null;
    }

    public boolean addCourse(Course course) {
        if (getCourse(course.getCode()) == null) {
            courses.add(course);
            return true;
        }
        return false;
    }

    public Course getCourse(String code) {
        for (Course course : courses) {
            if (course.getCode().equals(code)) {
                return course;
            }
        }
        return null;
    }

    public void removeProgram(Program program) {
        programs.remove(program);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public ArrayList<Staff> getTutors() {
        ArrayList<Staff> tutors = new ArrayList<>();
        for (Staff s : staff) {
            if (s.getType().equals("Academic")) {
                tutors.add(s);
            }
        }
        return tutors;
    }

    public boolean addStaff(Staff st) {
        for (Staff s : staff) {
            if (s.getId().equals(st.getId())) {
                return false;
            }
        }
        staff.add(st);
        return true;
    }

    public boolean registerCourse(Course course, int semester) {
        return currentStudent.registerCourse(course, semester);
    }

    public List<RegisteredCourse> getRegisteredCourses() {
        return currentStudent.getCourses();
    }

    public static void main(String[] args) {
        ELearningManagementSystem system = new ELearningManagementSystem();
        new MainFrame(system).setVisible(true);
    }
}
