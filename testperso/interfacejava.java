package testperso;

import java.awt.*;

public class interfacejava extends Frame {

    public interfacejava() {
        super();
        setTitle("Calculatrice Simple");
        setSize(500, 350);
        setLayout(new GridLayout(4, 3));
        for (int num = 1; num <= 9; num++) {
            add(new Button(Integer.toString(num)));
        }

        pack();
        setVisible(isFocusableWindow()); // affiche la fenetre
    }

    public static void main(String[] args) {
        new interfacejava();
    }
    

}

