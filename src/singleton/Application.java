package singleton;

public class Application {

    public static void main(String[] args) {

        /** Without Thread **/
        for (int i = 0; i < 5; i++) {
            Singleton singleton = Singleton.getInstance();
            singleton.Treat("Task N° "+(i+1));

        }
        System.out.println("-----------------------------------------------------");
        /** With Thread **/

        for (int i = 0; i < 5; i++) {
            ThreadedTask task = new ThreadedTask("Thead N° "+(i+1));
            task.start();

        }

    }
}
