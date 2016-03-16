package cours_prog_objet_s2;

import java.io.*;

public class Compteur implements Runnable {

    public final int max;

    public Compteur(int max) {
        this.max = max;
    }

    public void run() {
        for (int ix = 0; ix < max; ix++) {
            try {
                File temp = File.createTempFile("cpt", "");
                System.out.println("#" + this + ":" + temp);
                temp.delete();
            } catch (IOException exc) {/*test */

            }
        }
    }
}
