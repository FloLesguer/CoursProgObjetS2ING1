package tp2_correction;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Exo4 extends JFrame {

    JLabel nom = new JLabel("Nom");
    JLabel mdp = new JLabel("Mot de passe");
    JTextField field1 = new JTextField();
    JTextField field2 = new JTextField();
    JButton bouton1 = new JButton("Valider");
    JButton bouton2 = new JButton("Annuler");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    String string1 = "florian";
    String string2 = "mdp";

    JPanel panelreser = new JPanel();
    String path = "dd.jpg";

    public Exo4() {
        setLayout(new GridLayout(10, 1));
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.SOUTH);
        this.add(panelreser);
        panelreser.setVisible(false);
        panel1.setLayout(new GridLayout());
        panel1.add(nom, BorderLayout.WEST);
        panel1.add(field1, BorderLayout.WEST);
        panel1.add(mdp, BorderLayout.EAST);
        panel1.add(field2, BorderLayout.EAST);
        panel2.setLayout(new GridLayout());
        panel2.add(bouton1, BorderLayout.WEST);
        panel2.add(bouton2, BorderLayout.EAST);
        bouton1.addActionListener(new BoutonListener());
        bouton2.addActionListener(new Bouton2Listener());
    }

    class BoutonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (field1.getText() != null && field2.getText() != null) {
                if (string1.equals(field1.getText()) && string2.equals(field2.getText())) {
                    JOptionPane.showMessageDialog(bouton1, "Bienvenue Florian !!");
                    panel1.setVisible(false);
                    panel2.setVisible(false);
                    BufferedImage image;
                    try {
                        image = ImageIO.read(new File(path));
                        Image contentPane = new Image(image);
                        panelreser.add(contentPane);
                        panelreser.setVisible(true);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                } else {
                    JOptionPane.showMessageDialog(bouton1, "Vous avez oublie de saisir le nom/le mot de passe...");
                }
            }
        }
    }

    class Bouton2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            field1.setText(null);
            field2.setText(null);
        }
    }

    public static void main(String[] args) {
        Exo4 test = new Exo4();
        test.pack();
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class Image extends JPanel {

        BufferedImage image;

        public Image(BufferedImage image) {
            this.image = image;
        }

        protected void paintComponent(Graphics g) {
            int x = (getWidth() - image.getWidth()) / 2;
            int y = (getHeight() - image.getHeight()) / 2;
            g.drawImage(image, x, y, this);
        }
    }
}
