package tp5_correction;

import javax.swing.*;
import javax.swing.event.CaretListener;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Exo4 {

    JFrame fenetre = new JFrame();
    JPanel panel2 = new JPanel();
    JPanel panel = new JPanel();
    JTextField message = new JTextField(null);
    JButton bouton1 = new JButton("Envoyer");
    JButton bouton2 = new JButton("Quitter");
    Thread tache = new Thread(new MonThread());

    public Exo4() {
        fenetre.setSize(400, 400);
        fenetre.setLayout(new BorderLayout());
        fenetre.add(panel, BorderLayout.SOUTH);
        fenetre.add(panel2);
        panel2.setLayout(new BorderLayout());
        bouton1.addActionListener(new BoutonListener());
        bouton2.addActionListener(new Bouton2Listener());
        panel.add(bouton1);
        panel.add(bouton2);
        panel2.add(message, BorderLayout.CENTER);
        fenetre.setVisible(true);

        SwingWorker sw = new SwingWorker<Object[], Void>() {
            public Object[] doInBackground() {
                return null;
            }

            public void done() {
                JOptionPane.showMessageDialog(bouton1, "Fichier cree");
            }
        };
        sw.execute();
    }

    public class MonThread implements Runnable {

        public void run() {
            while (true) {
                try {
                    FileWriter fichier = new FileWriter("temp.txt", true);
                    BufferedWriter buff = new BufferedWriter(fichier);
                    buff.newLine();
                    PrintWriter pw = new PrintWriter(buff);
                    pw.print(message.getText());
                    pw.close();
                    System.out.println(message.getText());
                } catch (IOException e) {
                    System.out.println("Probleme a l'ecriture du fichier");
                }
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class BoutonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (message != null) {
                tache.start();
            } else if (message == null) {
                JOptionPane.showMessageDialog(bouton1, "Pas de texte tape");
            }
        }
    }

    public class Bouton2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Exo4 test = new Exo4();
            }
        });
    }
}
