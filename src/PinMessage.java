public class PinMessage {



    public static void main(String[] args) {
        Cars bmw = new Cars();

    }
}
 class Cars {
    String name_car;
    int probeg_car;
    String color_car;

    Cars(){
        this.name_car = "untitled car";
        this.probeg_car = 0;
        this.color_car = "untitled color";
        System.out.println("CAR NAME: " + name_car +"\n" + "PROBEG:" + probeg_car + "\n" + "COLOR: " + color_car);
    }
    Cars(String name_car, int probeg_car, String color_car){
        this.name_car = name_car;
        this.probeg_car = probeg_car;
        this.color_car = color_car;

        System.out.println("CAR NAME: " + name_car +"\n" + "PROBEG:" + probeg_car + "\n" + "COLOR: " + color_car);
    }
}
