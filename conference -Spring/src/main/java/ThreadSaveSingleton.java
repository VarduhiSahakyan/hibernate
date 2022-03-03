public class ThreadSaveSingleton {


    private volatile static ThreadSaveSingleton instance;

    private ThreadSaveSingleton() {

    }

    public static ThreadSaveSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSaveSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSaveSingleton();
                }
            }
        }
        return instance;
    }
}
