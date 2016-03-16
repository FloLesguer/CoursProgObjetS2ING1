package tp3_correction;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Exercice3 extends Frame {

    private JLabel label;
    private JButton btnStart;
    private JButton btnStop;
    private JPanel panel;
    private Thread thread;
    private DefilementTexte df;

    public Exercice3() {
        label = new JLabel("Hello Shorty! ");
        btnStart = new JButton("Démarrer");
        btnStop = new JButton("Arrêter");

        df = new DefilementTexte();

        btnStart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Exercice3.this.defilement();
            }
        });

        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Exercice3.this.arretDefilement();
            }
        });

        panel = new JPanel(new FlowLayout());

        panel.add(btnStart);
        panel.add(btnStop);

        add(label, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public void defilement() {
        if (!df.isAlive()) {
            df.start();
        }
    }

    public void arretDefilement() {
        if (df.isAlive()) {
            df.yield();
        }
    }

    public class DefilementTexte extends Thread {

        public void run() {
            while (isAlive()) {
                try {
                    String texte = label.getText();
                    String debut = texte.substring(0, texte.length() - 1);
                    String fin = texte.substring(texte.length() - 1);
                    texte = fin + debut;
                    label.setText(texte);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Exercice3 exo3 = new Exercice3();
    }
}
