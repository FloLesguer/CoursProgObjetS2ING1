package tp3_correction;

import java.io.*;

public class Compteur implements Runnable {

    private final int max;

    public Compteur(int max2) {
        max = max2;
    }

    public void run() {
        for (int i = 0; i < max; i++) {
            try {
                File temp = File.createTempFile("cpt", "");
                System.out.println("#" + this + " : " + temp);
                temp.delete();
            } catch (IOException e) {
            }
        }
    }
}
