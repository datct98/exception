import java.util.ArrayList;

public class Clazz {
    private ArrayList<Student> students;

    public Clazz(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "students=" + students +
                '}';
    }
}
