package n07_UltimateEfficient_WithFinalAttribute_Immutable;

public class Test {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> MySingleton.getInstance());
        Thread t2 = new Thread(() -> MySingleton.getInstance());

        t1.start();
        t2.start();

        MySingleton.getInstance();
    }
}
