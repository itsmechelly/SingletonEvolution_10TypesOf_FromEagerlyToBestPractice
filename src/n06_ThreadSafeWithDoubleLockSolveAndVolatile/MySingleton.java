package n06_ThreadSafeWithDoubleLockSolveAndVolatile;

public class MySingleton {

    private volatile static MySingleton instance = null;//we added volatile

    private MySingleton() {
        System.out.println("CTOR in action!");
    }

    public static MySingleton getInstance() {// Thread Safe with double lock solve
        if (instance == null) {
            synchronized (MySingleton.class) {
                if (instance == null) {
                    instance = new MySingleton();
                }
            }
        }
        return instance;
    }
}
