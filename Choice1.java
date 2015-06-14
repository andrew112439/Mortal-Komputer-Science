import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Choice1 implements MouseListener // Mouse Listener for when player one chooses a character
{
    public Selection selection;
    public JLabel face;
    public int num;
    public boolean selected = false;
    
    public Choice1(Selection selection, JLabel face, int num) // Gets information from the character label
    {
        this.selection = selection;
        this.face = face;
        this.num = num;
    }
    
    public void mouseClicked(MouseEvent e) // Makes it so that when the label is clicked, it stores the information and allows player 2 to choose a character
    {
        selected = true;
        selection.player1 = selection.characters.get(num);
        face.setBackground(Color.MAGENTA);
        selection.lbl1.setText("Player 2 Choose Character");
        
        for (int i = 0; i < selection.faces.size(); i++)
        {
            if (i != num)
            {
                selection.faces.get(i).removeMouseListener(selection.faces.get(i).getMouseListeners()[0]);
                selection.faces.get(i).addMouseListener(new Choice2(selection, selection.faces.get(i), i));
            }
        }
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
        if (selected == false)
        {
            face.setBackground(null);
        }
    }
}