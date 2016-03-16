package tp4_correction;

import java.io.*;

public class Exo2 {

    public synchronized void MaMethode() {
        Thread patience = new Thread() {
            public void run() {
                while (!isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                    System.out.println("ping");

                }
            }
        };
        patience.start();
        System.out.println("pong");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println("coucou");
        try {
            patience.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Exo2 test = new Exo2();
        test.MaMethode();
    }
}
