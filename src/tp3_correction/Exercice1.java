package tp3_correction;

public class Exercice1 {

    public class MonRunnable implements Runnable {

        public void run() {
            System.out.println("Hello World");
        }
    }

    public Exercice1() {
        Thread tache = new Thread(new MonRunnable());
        tache.start();

        MonThread tache1 = new MonThread();
        tache1.start();
    }

    public static void main(String[] args) {
        Exercice1 exo1 = new Exercice1();
    }

    public class MonThread extends Thread {

        public void run() {
            System.out.println("Hello World2");
        }
    }
}
