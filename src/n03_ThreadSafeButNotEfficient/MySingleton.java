package n03_ThreadSafeButNotEfficient;

public class MySingleton {

    private static MySingleton instance = null;

    private MySingleton() {
        System.out.println("CTOR in action!");
    }

    public static synchronized MySingleton getInstance() {//Now Thread Safe, But more efficient
        if (instance == null) {
            instance = new MySingleton();//Not Thread Safe
        }
        return instance;
    }
}
