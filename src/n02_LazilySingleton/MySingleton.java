package n02_LazilySingleton;

public class MySingleton {

    private static MySingleton instance = null;

    private MySingleton() {
        System.out.println("CTOR in action!");
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();// Not Thread safe
        }
        return instance;
    }
}
