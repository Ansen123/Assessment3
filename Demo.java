import p1.Faculty;
import p1.Student;

public class Demo {
    public static void main(String args [] ) {
        Faculty p1f1 = new Faculty(511,"Maths");
        Student p1s1 = new Student("Ansen",79,5);

        p2.Faculty p2f2 = new p2.Faculty(758,"Hindi");
        p2.Student p2s2 = new p2.Student("Francis",48,4);

        p1f1.display();
        p1s1.display();
        p2f2.display();
        p2s2.display();
    }
}
