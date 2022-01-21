package n09_OldEnumRemainder;

public class MySingleton {

    public static final String color1 = "RED";
    public static final String color2 = "YELLOW";
    public static final String color3 = "GREEN";

    static {
        System.out.println("Moshe");
    }

    public static void main(String[] args) {

        System.out.println("START");
        System.out.println(color1);
        System.out.println("END");
    }
}
