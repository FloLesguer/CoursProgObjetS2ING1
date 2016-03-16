package cours_prog_objet_s2;

public class Exo1TP3 {

    public class MonRunnable implements Runnable {

        public void run() {
            System.out.println("Ceci est un message");
        }
    }

    public static class MonThread extends Thread {

        public void run() {
            System.out.println("Ceci est un autre message");
        }
    }

    public Exo1TP3() {
        Thread tache = new Thread(new MonRunnable());
        Thread tache2 = new Thread(new MonThread());
        tache.start();
        tache2.start();
    }

    public static void main(String[] args) {
        new Exo1TP3();
    }
}