public class Program {
    
    private String code;
    private String name;
    private int year;
    private int semester;
    
    public Program(String code, String name, int year, int semester) {
        this.code = code;
        this.name = name;
        this.year = year;
        this.semester = semester;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getSemester() {
        return semester;
    }
    
    public void setSemster(int semester) {
        this.semester = semester;
    }
    
    public void updateDetails(String name, int year, int semester) {
        setName(name);
        setYear(year);
        setSemster(semester);
    }
    
}
