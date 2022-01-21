package n04_MoreEfficient_ButNotThreadSafe_TheDoubleLockProblem;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> MySingleton.getInstance());
        Thread t2 = new Thread(() -> MySingleton.getInstance());

        t1.start();
        t2.start();
    }
}
