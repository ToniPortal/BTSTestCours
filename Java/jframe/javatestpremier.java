package jframe;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;

public class javatestpremier {
    public static void main(String[] args) {
        System.out.println("Démarrage de la fenêtre Jframe");

        // Création fênetre
        JFrame fenetre = new JFrame();
        fenetre.setTitle("Premier JFrame");
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Panel Principal
        JPanel panelprinc = new JPanel();
        JButton btn1 = new JButton("BTN1");
        JButton btn2 = new JButton("BTN2");
        panelprinc.add(btn1, BorderLayout.EAST);
        panelprinc.add(btn2, BorderLayout.WEST);
        panelprinc.setBackground(Color.white);

        //Panel Top
        JPanel paneltop = new JPanel();
        JButton btntop1 = new JButton("Premier");
        JButton btntop2 = new JButton("Deuxième");
paneltop.add(btntop1);
paneltop.add(btntop2);
paneltop.setBackground(Color.BLUE);

        // Footer
        JPanel panelfooter = new JPanel();
        JLabel label = new JLabel("Footer", JLabel.CENTER);
        panelfooter.setBackground(Color.red);
        panelfooter.add(label);

        //Fenetre Add
        fenetre.add(panelprinc,BorderLayout.CENTER);
        fenetre.add(paneltop, BorderLayout.PAGE_START);
        fenetre.add(panelfooter, BorderLayout.PAGE_END);
        

        fenetre.setSize(500, 500);
        fenetre.setVisible(true);
    }
}
