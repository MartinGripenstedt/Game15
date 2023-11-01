import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
public class Game15 extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new Game15();
    }
    JPanel knappar = new JPanel();
    JPanel victoryMessagePanel = new JPanel();
    JPanel newGamePanel = new JPanel();
    JLabel victoryMessage = new JLabel("Grattis du vann!");
    JButton newGameButton = new JButton("New Game");
    JButton easyWinButton = new JButton("Easy Win Mode");
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
    List<JButton> buttonListSorted = new ArrayList<>();
    List<JButton> buttonListEasyWin = new ArrayList<>();
    JButton[][] buttonGrid = new JButton[4][4];


    Game15(){
        setLayout(new BorderLayout());
        add(victoryMessagePanel,BorderLayout.NORTH);
        add(newGamePanel,BorderLayout.SOUTH);
        add(knappar, BorderLayout.CENTER);
        knappar.setLayout(new GridLayout(4,4));

        victoryMessagePanel.add(victoryMessage);
        victoryMessage.setFont(new Font("Arial", Font.BOLD, 24));
        victoryMessagePanel.setBackground(Color.GREEN);
        victoryMessagePanel.setVisible(false);
        newGamePanel.add(newGameButton);
        newGamePanel.add(easyWinButton);

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

        for (JButton button : buttonList) {
            button.setFont(new Font("Arial", Font.BOLD, 24));
        }

        buttonListSorted.addAll(buttonList);
        buttonListEasyWin.addAll(buttonList);
        buttonListEasyWin.set(14, jb16);
        buttonListEasyWin.set(15, jb15);
        Collections.shuffle(buttonList);


        easyWinButton.addActionListener(l -> {
            victoryMessagePanel.setVisible(false);
            int index = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    buttonGrid[i][j] = buttonListEasyWin.get(index);
                    index++;
                }
            }
            knappar.removeAll();
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    knappar.add(buttonGrid[x][y]);
                }
            }
            knappar.revalidate();
            knappar.repaint();
        });


        newGameButton.addActionListener(l -> {
            victoryMessagePanel.setVisible(false);
            Collections.shuffle(buttonList);
                    int index = 0;
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            buttonGrid[i][j] = buttonList.get(index);
                            index++;
                        }
                    }
            knappar.removeAll();
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    knappar.add(buttonGrid[x][y]);
                }
            }
            knappar.revalidate();
            knappar.repaint();
            });


        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                buttonGrid[i][j] = buttonList.get(index);
                index++;
            }
        }

        add(knappar);
        for (JButton button : buttonList) {
            knappar.add(button);
        }

        for (JButton button : buttonList) {
            button.addActionListener(this);
        }

        setVisible(true);
        setSize(430,430);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        boolean swapped = false;

        outerLoop:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (buttonGrid[i][j] == e.getSource()) {
                    JButton actualButton = buttonGrid[i][j];

                    if (i > 0 && buttonGrid[i-1][j] == jb16) {
                        buttonGrid[i][j] = jb16;
                        buttonGrid[i-1][j] = actualButton;
                        swapped = true;
                    } else if (i < 3 && buttonGrid[i+1][j] == jb16) {
                        buttonGrid[i][j] = jb16;
                        buttonGrid[i+1][j] = actualButton;
                        swapped = true;
                    } else if (j > 0 && buttonGrid[i][j-1] == jb16) {
                        buttonGrid[i][j] = jb16;
                        buttonGrid[i][j-1] = actualButton;
                        swapped = true;
                    } else if (j < 3 && buttonGrid[i][j+1] == jb16) {
                        buttonGrid[i][j] = jb16;
                        buttonGrid[i][j+1] = actualButton;
                        swapped = true;
                    }
                    if (swapped) {
                        break outerLoop;
                    }
                }
            }
        }
        //Refresh GUI
        if (swapped) {
            knappar.removeAll();
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    knappar.add(buttonGrid[x][y]);
                }
            }
            knappar.revalidate();
            knappar.repaint();
        }
            buttonList.clear();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <4; j++) {
                    buttonList.add(buttonGrid[i][j]);

                }
            }
        if(buttonList.equals(buttonListSorted)){
            victoryMessagePanel.setVisible(true);
        }
    }
}