import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Person // Class for storing information about a single character
{
    public int life;
    public String name;
    public int player;
    public Game game;
    public ImageIcon face;
    public ImageIcon body1;
    public ImageIcon punch1;
    public ImageIcon kick1;
    public ImageIcon body2;
    public ImageIcon punch2;
    public ImageIcon kick2;
    
    public Person(String name, int player, String facePic, String body1Pic, String punch1Pic, String kick1Pic, String body2Pic, String punch2Pic, String kick2Pic) // Sets up the character
    {
        this.name = name;
        this.player = player;
        face = new ImageIcon(facePic);
        body1 = new ImageIcon(body1Pic);
        punch1 = new ImageIcon(punch1Pic);
        kick1 = new ImageIcon(kick1Pic);
        body2 = new ImageIcon(body2Pic);
        punch2 = new ImageIcon(punch2Pic);
        kick2 = new ImageIcon(kick2Pic);
        life = 100;
    }
    
    public void setPlayer(int p) // Makes the player player 1 or player 2
    {
        player = p;
    }
    
    public void setGame(Game g) // Sets the variable "game"
    {
        game = g;
    }
    
    public String getAbility() // Returns ability for in the future when the game will have a special ability for each character
    {
        return "Ability";
    }
}