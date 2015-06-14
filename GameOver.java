import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameOver extends JFrame // Class for showing the results of the game
{
    public Person player1;
    public Person player2;
    public JLabel face;
    public String winner;
    public int life1;
    public int life2;
    public JButton playAgain;
    
    public GameOver(Person player1, Person player2) // Game Over Frame
    {
        this.player1 = player1;
        this.player2 = player2;
        life1 = player1.life;
        life2 = player2.life;
        playAgain = new JButton("Play Again?");
        playAgain.addActionListener(new PlayAgain(this));
        
        if (life1 < 0)
        {
            life1 = 0;
        }
        
        if (life2 < 0)
        {
            life2 = 0;
        }
        
        if (life1 > life2)
        {
            face = new JLabel(player1.face);
            winner = player1.name;
        }
        else if (life1 == life2)
        {
            face = new JLabel();
            winner = "No One";
        }
        else
        {
            face = new JLabel(player2.face);
            winner = player2.name;
        }
        
        setSize(750, 750);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(new JLabel("Game Over"));
        add(face);
        add(new JLabel(winner + " Wins!"));
        add(new JLabel(life1 + " - " + life2));
        add(playAgain);
    }
}