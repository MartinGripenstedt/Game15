import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Game15 extends JFrame {
    JPanel knappar = new JPanel();
    JButton jb1 = new JButton("1");
    JButton jb2 = new JButton("2");
    JButton jb3 = new JButton("3");
    JButton jb4 = new JButton("4");
    JButton jb5 = new JButton("5");
    JButton jb6 = new JButton("6");
    JButton jb7 = new JButton("7");
    JButton jb8 = new JButton("8");
    JButton jb9 = new JButton("9");
    JButton jb10 = new JButton("10");
    JButton jb11 = new JButton("11");
    JButton jb12 = new JButton("12");
    JButton jb13 = new JButton("13");
    JButton jb14 = new JButton("14");
    JButton jb15 = new JButton("15");
    JButton jb16 = new JButton();

    Game15(){
        knappar.setLayout(new GridLayout(4,4));
        add(knappar);
        knappar.add(jb1.);
        knappar.add(jb2);
        knappar.add(jb3);
        knappar.add(jb4);
        knappar.add(jb5);
        knappar.add(jb6);
        knappar.add(jb7);
        knappar.add(jb8);
        knappar.add(jb9);
        knappar.add(jb10);
        knappar.add(jb11);
        knappar.add(jb12);
        knappar.add(jb13);
        knappar.add(jb14);
        knappar.add(jb15);
        knappar.add(jb16);

        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Game15();

    }
}