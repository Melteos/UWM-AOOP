import java.util.*;
public class Classroom {

    private List<Pupil> pupils;
    private String className;

    public Classroom(String className, List<Pupil> pupils){
        this.className=className;
        this.pupils=pupils;
    }
    public Classroom(Classroom c) {
        if(c!=null){
            this.className=c.getClassName();
            this.pupils = new ArrayList<Pupil>();
            for(Pupil p: c.getPupils()){
                this.pupils.add(p.clone());
            }
        }
    }

    public Classroom clone() {
        Classroom clone = new Classroom(this);
        return clone;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public List<Pupil> getPupils() {
        return pupils;
    }

    public void addPupil(Pupil p){
        this.pupils.add(p);
    }
}
