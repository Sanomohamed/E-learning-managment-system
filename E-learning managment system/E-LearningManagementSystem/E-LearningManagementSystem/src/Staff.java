public class Staff extends User {

    private String id;
    private String position;
    private String type;

    public Staff(String id, String name, String icNumber, String permanentAddress, String position, String type) {
        super(name, icNumber, permanentAddress);
        this.id = id;
        this.position = position;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
