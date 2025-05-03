public class Student {
    String name;
    int id;
    static String collage = "TATU";
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void print() {
        System.out.println(id+ " " + name + " " + collage);
    }
}
