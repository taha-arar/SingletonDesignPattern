package singleton;

public class Singleton {

    private static final Singleton SINGLETON ; /** This is the static member **/
    private int counter;

    static{
        SINGLETON = new Singleton(); /** This is a static block loads in every execution **/
    }

    private Singleton() {  /** This is the private constructor With one instanciation in the Main  **/
        System.out.println("Instanciation Of Singleton");
    }
    public static Singleton getInstance(){   /** This is the Static factory method**/
        return SINGLETON;
    }

    /** This is a code to do ...**/
    public synchronized void Treat(String taskName){
        System.out.println("This is the task of: "+taskName);
        for (int i = 0; i <= 5; i++) {
            counter++;
            System.out.println("This is the time N° "+counter+" executing this task");
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.getStackTrace();
            }
        }
        System.out.println("End of Treatment ... N° of counts "+counter);

    }

}
