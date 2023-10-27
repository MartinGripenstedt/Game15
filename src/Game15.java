import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code. Kalle
public class Game15 extends JFrame implements ActionListener {
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
    List<JButton> buttonList = new ArrayList<>();

    Point loc1 = new Point(0,0);
    Point loc2 = new Point(0,1);
    Point loc3 = new Point(0,2);
    Point loc4 = new Point(0,3);
    Point loc5 = new Point(1,0);
    Point loc6 = new Point(1,1);
    Point loc7 = new Point(1,2);
    Point loc8 = new Point(1,3);
    Point loc9 = new Point(2,0);
    Point loc10 = new Point(2,1);
    Point loc11 = new Point(2,2);
    Point loc12 = new Point(2,3);
    Point loc13 = new Point(3,0);
    Point loc14 = new Point(3,1);
    Point loc15 = new Point(3,2);
    Point loc16 = new Point(3,3);
    List<Point> pointList = new ArrayList<>();





    Game15(){
        setLayout(new BorderLayout());
        add(knappar, BorderLayout.CENTER);
        knappar.setLayout(new GridLayout(4,4));

        buttonList.add(jb1);
        buttonList.add(jb2);
        buttonList.add(jb3);
        buttonList.add(jb4);
        buttonList.add(jb5);
        buttonList.add(jb6);
        buttonList.add(jb7);
        buttonList.add(jb8);
        buttonList.add(jb9);
        buttonList.add(jb10);
        buttonList.add(jb11);
        buttonList.add(jb12);
        buttonList.add(jb13);
        buttonList.add(jb14);
        buttonList.add(jb15);
        buttonList.add(jb16);
        Collections.shuffle(buttonList);

        //Tilldela knappar sina Points
        buttonList.get(0).setLocation(loc1);
        buttonList.get(1).setLocation(loc2);
        buttonList.get(2).setLocation(loc3);
        buttonList.get(3).setLocation(loc4);
        buttonList.get(4).setLocation(loc5);
        buttonList.get(5).setLocation(loc6);
        buttonList.get(6).setLocation(loc7);
        buttonList.get(7).setLocation(loc8);
        buttonList.get(8).setLocation(loc9);
        buttonList.get(9).setLocation(loc10);
        buttonList.get(10).setLocation(loc11);
        buttonList.get(11).setLocation(loc12);
        buttonList.get(12).setLocation(loc13);
        buttonList.get(13).setLocation(loc14);
        buttonList.get(14).setLocation(loc15);
        buttonList.get(15).setLocation(loc16);


        //Lägga till knappar i listan buttonList
        add(knappar);
        for (JButton button :buttonList) {
            knappar.add(button);
        }

        setVisible(true);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Game15();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1) {
            System.out.println("1");

        }
    }
}