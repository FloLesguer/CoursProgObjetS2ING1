package Swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

public class TD2Exo1 {

    public JFrame maframe = new JFrame("Nouveau test");
    
    
    private JPanel panel1;
    private JLabel nouveaumessage;

    public TD2Exo1() {

        initUI();
    }

    private void initUI() {

        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                TD2Exo1 ex = new TD2Exo1();
                ex.setVisible(true);
            }
        });
    }
}
