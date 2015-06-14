import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayAgain implements ActionListener // Class for starting a new game
{
    public GameOver gameOver;
    
    public PlayAgain(GameOver gameOver) // Gets the gameOver class
    {
        this.gameOver = gameOver;
    }
    
    public void actionPerformed(ActionEvent e) // Makes a new Game start when the button is pressed
    {
        gameOver.dispose();
        Selection.main(new String[0]);
    }
}