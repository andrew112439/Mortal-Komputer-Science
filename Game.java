import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Game extends JFrame // Main class for playing the game
{
    public Person player1;
    public Person player2;
    public JLabel body1;
    public JLabel body2;
    public JLabel life1;
    public JLabel life2;
    public JLabel colosseum;
    
    public Game(Person player1, Person player2) // Creates a new game frame
    {
        colosseum = new JLabel(new ImageIcon("Colosseum2.jpg"));
        colosseum.setBounds(0, 0, 750, 750);
        this.player1 = player1;
        player1.setPlayer(1);
        player1.setGame(this);
        body1 = new JLabel(player1.body2);
        body1.setBounds(0, 350, 138, 184);
        this.player2 = player2;
        player2.setPlayer(2);
        player2.setGame(this);
        body2 = new JLabel(player2.body1);
        body2.setBounds(612, 350, 138, 184);
        addKeyListener(new Actions(player1, body1, player2, body2, this));
        life1 = new JLabel(player1.name + ": " + player1.life);
        life1.setBounds(0, 100, 100, 50);
        life2 = new JLabel(player2.name + ": " + player2.life);
        life2.setBounds(640, 100, 100, 50);
        setSize(750, 750);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(body1);
        add(body2);
        add(life1);
        add(life2);
        add(colosseum);
    }
}