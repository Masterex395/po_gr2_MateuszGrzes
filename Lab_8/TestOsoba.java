import pl.imiajd.grzes.*;
import java.time.*;

public class TestOsoba {
    public static void main(String[] args){
        String[] names = new String[2];
        names[0] = "Mateusz";
        names[1] = "Mati";
        LocalDate birth = LocalDate.of(2000, 7, 21);
        LocalDate hire = LocalDate.of(2020, 3, 4);

        Student s = new Student(names,birth,true,3.4);
        System.out.println(s.getImiona()[0]);
        System.out.println(s.getPlec());
        System.out.println(s.getSredniaOcen());
        s.setSredniaOcen(4.1);
        System.out.println(s.getSredniaOcen());

        Pracownik p = new Pracownik(names, birth, true, hire);
        System.out.println(p.getImiona()[1]);
        System.out.println(p.getPlec());
        System.out.println(p.getDataZatrudnienia());
    }

}
