import javax.swing.*;
public class EjemploJLabel extends JFrame{

  private JLabel label1;

  public EjemploJLabel() {
    setLayout(null);
    setBounds(10,10,400,300);
    setTitle("Ejemplo 4: JLabel");
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    label1 = new JLabel("Hola Mundo.");
    label1.setBounds(10,20,200,30);
    add(label1);
    setVisible(true);

  }

  public static void main(String[] args) {
    new EjemploJLabel();

  }
}

