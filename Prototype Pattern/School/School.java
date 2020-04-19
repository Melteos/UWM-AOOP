public class School {

    private List<Classroom> cls;
    private String address;

    public School(String address) {
        this.cls = new List<Classroom>();
        this.address=address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCls(List<Classroom> cls) {
        this.cls = cls;
    }

    public void addClassroom(Classroom c) {
        this.cls.add(c);
    }
}
