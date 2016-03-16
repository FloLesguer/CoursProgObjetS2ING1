package tp4_correction;

import java.io.*;

public class Exo1 {

    private int i = 1;

    public synchronized void testModif() {
        System.out.println(i);
        i = 2 * i;
        try {
            File temp = File.createTempFile("cpt", "");
            temp.delete();
        } catch (IOException e) {
        }
        i = i - 1;
    }

    class Exo1Run implements Runnable {

        public void run() {
            while (true) {
                testModif();
            }
        }
    }

    public void lancerThread() {
        Thread thread1 = new Thread(new Exo1Run());
        thread1.start();
    }

    public static void main(String[] args) {
        Exo1 exo1 = new Exo1();

        exo1.lancerThread();
        exo1.lancerThread();
        exo1.lancerThread();
    }
}
