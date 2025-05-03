public class MathFunctions {
    static double pi = 3.14159265359;
    static double e = 2.71828182846;

    static void circle(int r){
        System.out.println(pi*Math.pow(r,2));
    }

    static void e_power(int a){
        System.out.println(Math.pow(e,a));
    }
    static void geron(int a, int b, int c){
        int p = (a+b+c)/2;
        System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
