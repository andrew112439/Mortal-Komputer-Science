import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Selection extends JFrame // Class for selecting characters
{
    public ArrayList<Person> characters = new ArrayList<Person>();
    public ArrayList<JLabel> faces = new ArrayList<JLabel>();
    public Person player1;
    public Person player2;
    public JLabel lbl1;
    public Container c;
    
    public Selection() // Select characters Frame
    {
        characters.add(new Person("Connor", 0, "ConnorFace.png", "ConnorFace.png", "ConnorFace.png", "ConnorFace.png", "ConnorFace.png", "ConnorFace.png", "ConnorFace.png"));
        characters.add(new Person("David", 0, "DavidFace.png", "DavidFace.png", "DavidFace.png", "DavidFace.png", "DavidFace.png", "DavidFace.png", "DavidFace.png"));
        characters.add(new Person("Elliot", 0, "ElliotFace.png", "ElliotFace.png", "ElliotFace.png", "ElliotFace.png", "ElliotFace.png", "ElliotFace.png", "ElliotFace.png"));
        characters.add(new Person("Kevin", 0, "KevinFace.png", "KevinFace.png", "KevinFace.png", "KevinFace.png", "KevinFace.png", "KevinFace.png", "KevinFace.png"));
        characters.add(new Person("Jaret", 0, "JaretFace.png", "JaretFace.png", "JaretFace.png", "JaretFace.png", "JaretFace.png", "JaretFace.png", "JaretFace.png"));
        characters.add(new Person("Neil", 0, "NeilFace.png", "NeilFace.png", "NeilFace.png", "NeilFace.png", "NeilFace.png", "NeilFace.png", "NeilFace.png"));
        characters.add(new Person("Rebecca", 0, "RebeccaFace.png", "RebeccaFace.png", "RebeccaFace.png", "RebeccaFace.png", "RebeccaFace.png", "RebeccaFace.png", "RebeccaFace.png"));
        characters.add(new Person("Talal", 0, "TalalFace.png", "TalalFace.png", "TalalFace.png", "TalalFace.png", "TalalFace.png", "TalalFace.png", "TalalFace.png"));
        characters.add(new Person("Ben", 0, "BenFace.png", "BenFace.png", "BenFace.png", "BenFace.png", "BenFace.png", "BenFace.png", "BenFace.png"));
        characters.add(new Person("Andrew", 0, "AndrewFace.png", "AndrewFace.png", "AndrewFace.png", "AndrewFace.png", "AndrewFace.png", "AndrewFace.png", "AndrewFace.png"));
        characters.add(new Person("Tyler", 0, "TylerFace.png", "TylerFace.png", "TylerFace.png", "TylerFace.png", "TylerFace.png", "TylerFace.png", "TylerFace.png"));
        characters.add(new Person("Rahil", 0, "RahilFace.png", "RahilFace.png", "RahilFace.png", "RahilFace.png", "RahilFace.png", "RahilFace.png", "RahilFace.png"));
        characters.add(new Person("Mr. Howard", 0, "Mr. HowardFace.png", "Mr. HowardFace.png", "Mr. HowardFace.png", "Mr. HowardFace.png", "Mr. HowardFace.png", "Mr. HowardFace.png", "Mr. HowardFace.png"));
        
        setSize(1000, 850);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        c = new Container();
        c.setLayout(new GridLayout(4, 4, 3, 3));
        
        for (Person person: characters)
        {
            faces.add(new JLabel(person.name, person.face, JLabel.CENTER));
            faces.get(faces.size() - 1).setOpaque(true);
        }
        
        for (int i = 0; i < faces.size(); i++)
        {
            faces.get(i).addMouseListener(new Choice1(this, faces.get(i), i));
            c.add(faces.get(i));
        }
        
        lbl1 = new JLabel("Player 1 Choose Character");
        add(lbl1);
        add(c);
    }
    
    public static void main(String[] args) //Creates an instance of the class AFTER the GUI is set up
    {
        SwingUtilities.invokeLater(
        new Runnable()
        {
            public void run()
            {
                new Selection();
            }
        }
        );
    }
}