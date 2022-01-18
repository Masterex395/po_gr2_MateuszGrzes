import pl.imiajd.grzes.Adres;
import pl.imiajd.grzes.BetterRectangle;
import pl.imiajd.grzes.Student;
import pl.imiajd.grzes.Nauczyciel;
import pl.imiajd.grzes.Punkt;
import pl.imiajd.grzes.NazwanyPunkt;

public class Test {
    public static void main(String[] args){
        Adres a = new Adres("Grzes", 5, "Działdowo", 13200);
        Adres aa = new Adres("Kowalski", 6, 19, "Olsztyn", 15200);
        a.pokaz();
        aa.pokaz();
        System.out.println(a.przed(aa));
        Student s = new Student("Braun", 2001, "Informatyka");
        System.out.println(s.toString());
        Nauczyciel n = new Nauczyciel("Karpiński", 1965, 1000);
        System.out.println(n.toString());
        BetterRectangle r = new BetterRectangle(1, 0, 4, 2);
        System.out.println(r.getPerimeter());
        System.out.println(r.GetArea());
        NazwanyPunkt x = new NazwanyPunkt(1, 5, "Jeden");
        Punkt y = new Punkt(3, 7);
        Punkt z = new NazwanyPunkt(8, 2, "Dwa");
        System.out.println(x.getName());
        x.show();
        y.show();
        z.show();
    }
}
