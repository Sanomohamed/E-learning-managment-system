
public class Course {

    private String code;
    private String title;
    private int creditHrs;
    private String tutor;

    public Course(String code, String title, int creditHrs, String tutor) {
        this.code = code;
        this.title = title;
        this.creditHrs = creditHrs;
        this.tutor = tutor;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreditHrs() {
        return creditHrs;
    }

    public void setCreditHrs(int creditHrs) {
        this.creditHrs = creditHrs;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void updateDetails(String title, String tutor, int crHrs) {
        setTitle(title);
        setTutor(tutor);
        setCreditHrs(creditHrs);
    }

    @Override
    public String toString() {
        return code+":"+title+":("+creditHrs+")";
    }
    
    

}
