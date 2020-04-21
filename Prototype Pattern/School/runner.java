import java.util.*;
public class runner {
    public static void main(String args[]) {

        List<Pupil> pupils1 = new ArrayList<Pupil>();
        List<Pupil> pupils2 = new ArrayList<Pupil>();
        Pupil p1 = new Pupil("Ali");
        Pupil p2 = new Pupil("Veli");
        pupils1.add(p1);
        pupils2.add(p2);
        List<Classroom> cls = new ArrayList<Classroom>();
        Classroom c1 = new Classroom("Class1", pupils1);
        Classroom c2 = new Classroom("Class2",pupils2);
        cls.add(c1);
        cls.add(c2);
        School UWM = new School("Olsztyn",cls);

        School deepclone = (School) UWM.clone();

        for(Classroom c: deepclone.getCls()){
            System.out.print(c.getClassName() + ": ");
            for(Pupil p: c.getPupils()){
                System.out.print(p.getName() + ", ");
            }
            System.out.println();
        }

    }
}
