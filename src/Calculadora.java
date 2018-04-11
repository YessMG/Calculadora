import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculadora extends JFrame implements ActionListener
{
    // Variables de instancia
    JLabel et1, et2, et3, et4, et5, et6, et7;
    JTextField tf1;
    JButton b1, b2;
    
    double n, m, s;
    int op;
    
    Calculadora()
    {
        et1 = new JLabel("1. Sumar");
        et2 = new JLabel("2. Restar");
        et3 = new JLabel("3. Potencia");
        et4 = new JLabel("4. Multiplicacion");
        et5 = new JLabel("5. Division");
        et6 = new JLabel("6. Raiz Cuadrada");
        et7 = new JLabel("7. Salir");
        
        tf1 = new JTextField(5);
        
        b1 = new JButton("Aceptar");
        b2 = new JButton("Salir");
        
        setLayout(new FlowLayout());
        
        add(et1);
        add(et2);
        add(et3);
        add(et4);
        add(et5); 
        add(et6); 
        add(et7); add(tf1);
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            op = Integer.parseInt(tf1.getText());

            switch(op)
            {
                case 1: 
                    JOptionPane.showMessageDialog(null, "Operacion de suma");
                    n = Double.parseDouble(JOptionPane.showInputDialog("Capturar un digito:"));
                    m = Double.parseDouble(JOptionPane.showInputDialog("Capturar un digito:"));
                    s = n + m;
                    JOptionPane.showMessageDialog(null, s, "El resultado de la suma", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2: 
                    JOptionPane.showMessageDialog(null, "Operacion de resta");
                    n = Double.parseDouble(JOptionPane.showInputDialog("Capturar un digito:"));
                    m = Double.parseDouble(JOptionPane.showInputDialog("Capturar un digito:"));
                    s = n - m;
                    JOptionPane.showMessageDialog(null, s, "El resultado de la suma", JOptionPane.INFORMATION_MESSAGE);
                    break;    

                case 3: 
                    JOptionPane.showMessageDialog(null, "Operacion de potenciacion");
                    n = Double.parseDouble(JOptionPane.showInputDialog("Capturar la base:"));
                    m = Double.parseDouble(JOptionPane.showInputDialog("Capturar la potencia:"));
                    s = Math.pow(n, m);
                    JOptionPane.showMessageDialog(null, s, "El resultado de la suma", JOptionPane.INFORMATION_MESSAGE);
                    break;  
                    
                   
                case 4: 
                    JOptionPane.showMessageDialog(null, "Operacion de multiplicacion");
                    n = Double.parseDouble(JOptionPane.showInputDialog("Capturar el primer numero:"));
                    m = Double.parseDouble(JOptionPane.showInputDialog("Capturar el segundo numero:"));
                    s = n * m;
                    JOptionPane.showMessageDialog(null, s, "El resultado de la suma", JOptionPane.INFORMATION_MESSAGE);
                    break;  
                    
                   
                case 5: 
                    JOptionPane.showMessageDialog(null, "Operacion de division");
                    n = Double.parseDouble(JOptionPane.showInputDialog("Capturar el primer numero:"));
                    m = Double.parseDouble(JOptionPane.showInputDialog("Capturar el segundo numero:"));
                    s = n / m;
                    JOptionPane.showMessageDialog(null, s, "El resultado de la suma", JOptionPane.INFORMATION_MESSAGE);
                    break;  
                    
                   
                case 6: 
                    JOptionPane.showMessageDialog(null, "Operacion de raiz cuadrada");
                    n = Double.parseDouble(JOptionPane.showInputDialog("Capturar el numero a sacar raiz:"));
                    s = Math.sqrt(n);
                    JOptionPane.showMessageDialog(null, s, "El resultado de la suma", JOptionPane.INFORMATION_MESSAGE);
                    break;  

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        }
        
        if (e.getSource() == b2)
        {
            JOptionPane.showMessageDialog(null, "Terminando");
            System.exit(0);
        }
    }    
            
}