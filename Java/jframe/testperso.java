package jframe;

import java.awt.Color;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.JPanel;

public class testperso {

    public static void main(String[] args) {
        System.out.println("Démarrage de la fenêtre Jframe");

        String Tables = "";

        JFrame fenetre = new JFrame();
        JPanel panel = new JPanel();

        fenetre.setTitle("Premier JFrame");
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btnplus = new JButton("+");
        JButton btncalc = new JButton("calcBtn");
        JLabel label = new JLabel("", JLabel.CENTER);
        JLabel labelresult = new JLabel("Result", JLabel.CENTER);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                label.setText(label.getText() + "1");
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                label.setText(label.getText() + "2");

            }
        });
        btnplus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "+");
            }
        });

        btncalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                
            }
        });

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btnplus);
        panel.add(btncalc);
        panel.add(label);
        panel.add(labelresult);
        panel.setBackground(Color.RED);
        fenetre.add(panel);

        fenetre.setSize(500, 500);
        fenetre.setVisible(true);

    }





    

}
