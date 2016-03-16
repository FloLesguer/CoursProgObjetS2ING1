package tp2_correction;

import java.awt.*;
import javax.swing.*;

class Exo2 extends JFrame {

    protected JButton rep = new JButton("Repondre");
    protected JButton prec = new JButton("Precedent");
    protected JButton suiv = new JButton("Suivant");

    public Exo2() {
        setLayout(new BorderLayout(5, 5));
        String descr = "Description";
        JLabel label = new JLabel(descr);
        this.add(label, BorderLayout.NORTH);
        JTextArea jt = new JTextArea("Un exemple d'utilisation de LayoutManager.", 3, 50);
        this.add(new JScrollPane(jt), BorderLayout.CENTER);
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(rep);
        flowPanel.add(prec);
        flowPanel.add(suiv);
        this.add(flowPanel, BorderLayout.SOUTH);
    }

    public static void main(String args[]) {
        Exo2 frame1 = new Exo2();
        frame1.pack();
        frame1.setVisible(true);
    }
}
