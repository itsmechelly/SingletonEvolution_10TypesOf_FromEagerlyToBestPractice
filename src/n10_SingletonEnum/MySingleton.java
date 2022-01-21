package n10_SingletonEnum;

enum MySingleton {

    INSTANCE;
    String name = "Walter white";

    public void sayMyName() {
        System.out.println(name);
    }
}
