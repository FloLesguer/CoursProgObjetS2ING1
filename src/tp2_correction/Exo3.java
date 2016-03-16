package tp2_correction;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Exo3 extends JFrame {

    private static final long serialVersionUID = 1L;
    JTextArea jt = new JTextArea("", 3, 50);
    JButton bouton = new JButton("OK");
    JTextField field = new JTextField("question");

    public Exo3() {
        setLayout(new BorderLayout(3, 3));
        JPanel flowPanel = new JPanel(new FlowLayout());
        this.add(flowPanel, BorderLayout.SOUTH);
        this.add(field, BorderLayout.NORTH);
        flowPanel.add(jt, BorderLayout.CENTER);
        this.add(bouton, BorderLayout.CENTER);
        field.addKeyListener(keyListener);
    }

    public static void main(String[] args) {
        Exo3 test = new Exo3();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.pack();
        test.setVisible(true);
    }
    KeyListener keyListener = new KeyListener() {
        public void keyPressed(KeyEvent keyEvent) {
            //printIt("Pressed", keyEvent);
        }

        public void keyReleased(KeyEvent keyEvent) {
            printIt("Touche entr�e", keyEvent);
        }

        public void keyTyped(KeyEvent keyEvent) {
            //printIt("Typed", keyEvent);
        }

        private void printIt(String title, KeyEvent keyEvent) {
            int keyCode = keyEvent.getKeyCode();
            String keyText = KeyEvent.getKeyText(keyCode);
            System.out.println(title + " : " + keyText);
            jt.setText(field.getText());
            System.out.println(field.getText());
        }
    };
}
