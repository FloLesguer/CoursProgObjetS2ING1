package tp5_correction;

import javax.swing.*;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Exo2 {

    JLabel label1 = new JLabel("HELLO WORLD");
    JLabel label2 = new JLabel("DLROW OLLEH");
    JButton bouton1 = new JButton("Demarrer");
    JButton bouton2 = new JButton("Arreter");
    Thread tache = new Thread(new Defileur());
    JPanel panel = new JPanel(new BorderLayout());

    public class Defileur implements Runnable {

        public void run() {
            	//for(int i=0;i<10;i++){
            //panel.remove(label1);

            /*try{
             Thread.sleep(1000);
             }
             catch(InterruptedException e){}*/
            //}
        }
    }

    public Exo2() {
        JFrame fenetre = new JFrame();
        fenetre.setSize(400, 400);
        fenetre.getContentPane().add(panel, BorderLayout.CENTER);

        panel.add(label2, BorderLayout.CENTER);
        label2.setVisible(false);
        panel.add(label1, BorderLayout.CENTER);
        panel.add(bouton1, BorderLayout.WEST);
        panel.add(bouton2, BorderLayout.EAST);
        fenetre.setVisible(true);
        bouton1.addActionListener(new BoutonListener());
        bouton2.addActionListener(new Bouton2Listener());
        SwingWorker sw = new SwingWorker<Object[], Void>() {
            public Object[] doInBackground() {
                label2.setVisible(false);
                panel.add(label1, BorderLayout.CENTER);
                label1.setVisible(true);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                label1.setVisible(false);
                panel.add(label2, BorderLayout.CENTER);
                label2.setVisible(true);
                return null;
            }

            public void done() {

            }
        };
        sw.execute();
    }

    public class BoutonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        }
    }

    public class Bouton2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (tache.isAlive()) {
                tache.interrupt();
            }
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Exo2 test = new Exo2();
            }
        });
    }
}
