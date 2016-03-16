package TP4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exo2 {

    public static void main(String[] args) {

        Thread patience = new Thread() {
            public void run() {
                while (!isInterrupted()) {
                    System.out.println("Ping");
                    yield();
                   
                }
            }
        };
        patience.start();

        int i = 1;
        int j = 1;
        while (i < 100000) {
            i++;
            j--;
         System.out.println("Pong");
         Thread.yield();
        }
        //on fait des tas de choses
        patience.interrupt();

        try {
            patience.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Exo2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}