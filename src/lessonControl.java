public class lessonControl {
    public static void main(String[] args) {
        Human human1 = new Human("vasya", 12);
    }
}
class Human {
    private String name;
    private int age;

    public Human(){
        System.out.println("hello from first constructor");
    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("hello " + name + " ur " + age + " olds");
    }

}