public class Classroom extends java.lang.Cloneable{

    private List<Pupil> pupils;
    private String className;

    public Classroom(Classroom c) {
        this.className=c.getClassName();
        this.pupils = List.copyOf(c.getPupils());
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
