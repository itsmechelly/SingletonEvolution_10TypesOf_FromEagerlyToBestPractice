package n05_ThreadSafeWithDoubleLockSolve;

public class MySingleton {

    private static MySingleton instance = null;

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
