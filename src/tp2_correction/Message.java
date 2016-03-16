package tp2_correction;

import javax.swing.*;

public class Message {

    JFrame fenetre;

    public Message(String mess) {
        fenetre = new JFrame("Fen�tre");
        JLabel label = new JLabel(mess);
        fenetre.getContentPane().add(label);
    }

    public void demarrer() {
        fenetre.pack();
        fenetre.setVisible(true);
    }
}
