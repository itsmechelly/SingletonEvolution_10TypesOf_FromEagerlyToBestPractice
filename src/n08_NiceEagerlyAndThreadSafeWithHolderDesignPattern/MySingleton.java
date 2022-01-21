package n08_NiceEagerlyAndThreadSafeWithHolderDesignPattern;

public class MySingleton {

    private static class SingletonHolder {
        public static MySingleton instance = new MySingleton();
    }

    private MySingleton() {
        System.out.println("CTOR in action!");
    }

    public static MySingleton getInstance() {
        return SingletonHolder.instance;
    }
}
