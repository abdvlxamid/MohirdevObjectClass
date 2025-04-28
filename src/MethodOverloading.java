public class MethodOverloading {

    public void salom(int a, int b){
        System.out.println(a+b);
    }
    public void salom(double c , double d) {
        System.out.println(c-d);
    }
    public static void main(String[] args) {
        MethodOverloading lesson = new MethodOverloading();
        lesson.salom(12,12);
        lesson.salom(1.2,1.1);
    }
}
