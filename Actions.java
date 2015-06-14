import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Actions implements KeyListener // Class for making the characters perform actions when certain keys are pressed
{
    public String name1;
    public Person person1;
    public JLabel lbl1;
    public String name2;
    public Person person2;
    public JLabel lbl2;
    public Game game;
    
    public Actions(Person person1, JLabel lbl1, Person person2, JLabel lbl2, Game game) // Gets information from the game
    {
        this.person1 = person1;
        this.lbl1 = lbl1;
        name1 = person1.name;
        this.person2 = person2;
        this.lbl2 = lbl2;
        name2 = person2.name;
        this.game = game;
    }
    
    public void keyPressed(KeyEvent e) // Determines what happens when a key is pressed
    {
        if (e.getKeyChar() == 'w')
        {
            punch1();
        }
        else if (e.getKeyChar() == 's')
        {
            kick1();
        }
        else if (e.getKeyChar() == 'a')
        {
            moveBack1();
        }
        else if (e.getKeyChar() == 'd')
        {
            moveForward1();
        }
        else if (e.getKeyChar() == 'i')
        {
            punch2();
        }
        else if (e.getKeyChar() == 'k')
        {
            kick2();
        }
        else if (e.getKeyChar() == 'l')
        {
            moveBack2();
        }
        else if (e.getKeyChar() == 'j')
        {
            moveForward2();
        }
    }
    
    public void keyReleased(KeyEvent e)
    {
        
    }
    
    public void keyTyped(KeyEvent e)
    {
        
    }
    
    public void moveForward1() // Method to make player 1 move forward
    {
        if (lbl1.getIcon() == person1.body1)
        {
            lbl1.setIcon(person1.body2);
        }
        
        if (lbl1.getX() <= 592)
        {
            lbl1.setLocation(lbl1.getX() + 20, lbl1.getY());
        }
    }
    
    public void moveBack1() // Method to make player 1 move backward
    {
        if (lbl1.getIcon() == person1.body2)
        {
            lbl1.setIcon(person1.body1);
        }
        
        if (lbl1.getX() >= 20)
        {
            lbl1.setLocation(lbl1.getX() - 20, lbl1.getY());
        }
    }
    
    public void punch1() // Method to make player 1 punch
    {
        if (lbl1.getIcon() == person1.body1)
        {
            lbl1.setIcon(person1.punch1);
            
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            lbl1.setIcon(person1.body1);
        }
        else if (lbl1.getIcon() == person1.body2)
        {
            lbl1.setIcon(person1.punch2);
            
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            lbl1.setIcon(person1.body2);
        }
        
        if(lbl1.getX() - lbl2.getX() > -175 && lbl1.getX() - lbl2.getX() < 175)
        {
            person2.life = person2.life - 10;
            game.life2.setText(person2.name + ": " + person2.life);
            
            if (person2.life <= 0)
            {
                game.dispose();
                new GameOver(person1, person2);
            }
        }
    }
    
    public void kick1() // Method to make player 1 kick
    {
        if (lbl1.getIcon() == person1.body1)
        {
            lbl1.setIcon(person1.kick1);
            
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            lbl1.setIcon(person1.body1);
        }
        else if (lbl1.getIcon() == person1.body2)
        {
            lbl1.setIcon(person1.kick2);
            
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            lbl1.setIcon(person1.body2);
        }
        
        if(lbl1.getX() - lbl2.getX() > -220 && lbl1.getX() - lbl2.getX() < 220)
        {
            person2.life = person2.life - 5;
            game.life2.setText(person2.name + ": " + person2.life);
            
            if (person2.life <= 0)
            {
                game.dispose();
                new GameOver(person1, person2);
            }
        }
    }
    
    public void moveForward2() // Method to make player 2 move forward
    {
        if (lbl2.getIcon() == person2.body1)
        {
            lbl2.setIcon(person2.body2);
        }
        
        if (lbl2.getX() >= 20)
        {
            lbl2.setLocation(lbl2.getX() - 20, lbl2.getY());
        }
    }
    
    public void moveBack2() // Method to make player 2 move backward
    {
        if (lbl2.getIcon() == person2.body2)
        {
            lbl2.setIcon(person2.body2);
        }
        
        if (lbl2.getX() <= 592)
        {
            lbl2.setLocation(lbl2.getX() + 20, lbl2.getY());
        }
    }
    
    public void punch2() // Method to make player 2 punch
    {
        if (lbl2.getIcon() == person2.body1)
        {
            lbl2.setIcon(person2.punch1);
            
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            lbl2.setIcon(person2.body1);
        }
        else if (lbl2.getIcon() == person2.body2)
        {
            lbl2.setIcon(person2.punch2);
            
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            lbl2.setIcon(person2.body2);
        }
        
        if(lbl1.getX() - lbl2.getX() > -175 && lbl1.getX() - lbl2.getX() < 175)
        {
            person1.life = person1.life - 10;
            game.life1.setText(person1.name + ": " + person1.life);
            
            if (person1.life <= 0)
            {
                game.dispose();
                new GameOver(person1, person2);
            }
        }
    }
    
    public void kick2() // Method to make player 2 kick
    {
        if (lbl2.getIcon() == person2.body1)
        {
            lbl2.setIcon(person2.kick1);
            
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            lbl2.setIcon(person2.body1);
        }
        else if (lbl2.getIcon() == person2.body2)
        {
            lbl2.setIcon(person2.kick2);
            
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            lbl2.setIcon(person2.body2);
        }
        
        if(lbl1.getX() - lbl2.getX() > -220 && lbl1.getX() - lbl2.getX() < 220)
        {
            person1.life = person1.life - 5;
            game.life1.setText(person1.name + ": " + person1.life);
            
            if (person1.life <= 0)
            {
                game.dispose();
                new GameOver(person1, person2);
            }
        }
    }
}