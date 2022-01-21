package n04_MoreEfficient_ButNotThreadSafe_TheDoubleLockProblem;

public class MySingleton {

    private static MySingleton instance = null;

    private MySingleton() {
        System.out.println("CTOR in action!");
    }

    public static MySingleton getInstance() {// Better performance, But Again, Not Thread Safe
        if (instance == null) {
            synchronized (MySingleton.class) {
                instance = new MySingleton();
            }
        }
        return instance;
    }
}
