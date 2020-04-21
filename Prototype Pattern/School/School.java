import java.util.*;
public class School {

    private List<Classroom> cls;
    private String address;

    public School(String address, List<Classroom> cls) {
        this.cls = cls;
        this.address=address;
    }
    public School(School s){
        if(s!=null){
            this.address=s.address;
            this.cls = new ArrayList<Classroom>();
            for(Classroom c:s.getCls()){
                this.cls.add(c.clone());
            }
        }
    }
    public School clone() {
        School clone = new School(this);
        return clone;
    }

    public List<Classroom> getCls() {
        return cls;
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
