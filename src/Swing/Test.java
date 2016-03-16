package Swing;

import java.awt.BorderLayout;
import javax.swing.*;

public class Test {

    public static void main(String[] args) {
        JFrame fenetre = new JFrame("test de Frame");
        Font f = new Font("serif", Font.PLAIN, fontSize);
        Font SERIF_FONT = new Font("serif", Font.PLAIN, 24);
       
        fenetre.setSize(200, 200);
        if (args.length != 0) {
            fenetre.setLayout(null);
        }
        /* on rajoute un panneau */
        JPanel panneau = new JPanel(new BorderLayout());
        JPanel panneaubouton = new JPanel();
        panneaubouton.add(new JButton("Cliquez bande de salopes"));
        JLabel monlabel = new JLabel("Bonjour");
        panneau.setSize(300, 300);
        panneau.add(monlabel);
        panneau.add(panneaubouton, BorderLayout.WEST);
        fenetre.add(panneau);
        fenetre.add(panneaubouton);
        fenetre.show();
    }
}