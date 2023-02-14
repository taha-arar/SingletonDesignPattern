package singleton;

public class ThreadedTask extends Thread{
    private String name;

    public ThreadedTask(String name) {
        this.name = name;
    }


    @Override
    public void run() {
       Singleton singleton = Singleton.getInstance();
       singleton.Treat(name);
    }
}
