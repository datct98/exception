public class Student {
    private static int autoId =0;
    private int id;
    private int age;
    private String name;
    private String rank;

    public Student(String name, int age, String rank) {
        this.id = ++autoId;
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }
}
