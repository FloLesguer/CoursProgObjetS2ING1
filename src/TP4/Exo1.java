package TP4;
import java.io.File;
import java.io.IOException;


public class Exo1 {

    private int i = 1;

    public void testModif() {
        System.out.println(i);
        i = 2 * i;
        try {
            File temp = File.createTempFile("cpt", "");
            System.out.println("#" + this + ":" + temp);
            temp.delete();
        } catch (IOException exc){
            /* */
        } 
            i = i - 1;
        }

    
    public void lancerThread() {
        Thread t1 = new Thread(new interne());
        t1.start();
    }

    class interne implements Runnable {

        @Override
        public void run() {
            while (1 == 1) {
                testModif();
            }
        }
    }

    public static void main(String[] args) {
        Exo1 exo = new Exo1();
        for (int z = 0; z < 3; z++) {
            exo.lancerThread();
            System.out.println("Voici" + z);
        }
    }
}