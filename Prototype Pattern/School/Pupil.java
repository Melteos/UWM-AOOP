public class Pupil extends java.lang.Cloneable {

    private String name;

    public Pupil(Pupil p) {
        this.name = p.getName();
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
