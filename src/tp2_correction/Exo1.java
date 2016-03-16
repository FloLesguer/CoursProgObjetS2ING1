package tp2_correction;

import java.awt.Color;
import javax.swing.*;

public class Exo1 extends JFrame {

    JPanel panel = new JPanel();
    JLabel label = new JLabel("Coucou");
    JButton bouton = new JButton("Coucou");
    JTextField field = new JTextField("Coucou");

    public Exo1() {

        label.setForeground(Color.WHITE);
        bouton.setForeground(Color.BLACK);
        field.setForeground(Color.BLUE);

        //label.setBackground(new Color(150150150));
        //bouton.setBackground(new Color(150150150));
        //field.setBackground(new Color(150150150));

        this.add(label);
        this.add(bouton);
        this.add(field);

        this.setSize(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Exo1 test = new Exo1();
    }
}
