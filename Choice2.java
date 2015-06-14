import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Choice2 implements MouseListener // Mouse Listener for when player two chooses a character
{
    public Selection selection;
    public JLabel face;
    public int num;
    public boolean selected = false;
    
    public Choice2(Selection selection, JLabel face, int num) // Gets information from the character label
    {
        this.selection = selection;
        this.face = face;
        this.num = num;
    }
    
    public void mouseClicked(MouseEvent e) // Makes it so that when the label is clicked, it stores the information and starts a new game
    {
        selected = true;
        selection.player2 = selection.characters.get(num);
        face.setBackground(Color.CYAN);
        selection.lbl1.setText("Get Ready To Play");
        
        SwingUtilities.invokeLater(
        new Runnable()
        {
            public void run()
            {
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex)
                {
                    Thread.currentThread().interrupt();
                }
                
                selection.dispose();
                new Game(selection.player1, selection.player2);
            }
        }
        );
    }
    
    public void mousePressed(MouseEvent e)
    {
        
    }
    
    public void mouseReleased(MouseEvent e)
    {
        
    }
    
    public void mouseEntered(MouseEvent e) // Makes it so that the label turns green when the mouse hovers over it
    {
        if (selected == false)
        {
            face.setBackground(Color.GREEN);
        }
    }
    
    public void mouseExited(MouseEvent e) // Makes it so that the label stops being green once the mouse stops hovering over it
    {
        if (selected == false && face.getBackground() == Color.GREEN)
        {
            face.setBackground(null);
        }
    }
}