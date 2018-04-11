
import javax.swing.JFrame;

public class UsaCalculadora
{
    public static void main (String args[])
    {
        Calculadora c = new Calculadora();
        c.setTitle("Calculadora");
        c.setSize(200, 200);
        c.setVisible(true);
        
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}