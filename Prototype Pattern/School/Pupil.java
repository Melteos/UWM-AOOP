import java.util.*;
public class Pupil {

    private String name;

    public Pupil(String name){
        this.name=name;
    }
    public Pupil(Pupil p) {
        if(p!=null){
            this.name = p.getName();
        }
    }

    public Pupil clone() {
        Pupil clone = new Pupil(this);
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
