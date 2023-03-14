package Ejemplos;
import java.awt.*;
import javax.swing.*;
public class EjemploJFrameJButton extends JFrame
{
    public EjemploJFrameJButton( String titulo ) 
    {
        setTitle( titulo );
        inicializarComponentes();
        mostrarVentana();
    }

    public void inicializarComponentes() {
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        JButton btnUno = new JButton( "Uno" );
        JButton btnDos = new JButton( "Dos" );
        setLayout( new FlowLayout() );
        add(btnUno);
        add(btnDos);
    }  
    
    public void mostrarVentana() 
    {
        setBounds(50,50, 300, 200 );
        setVisible( true );
    } 
    
    public static void main( String[] args ) {
        EjemploJFrameJButton uno = new EjemploJFrameJButton( "Ventana 01" );
        EjemploJFrameJButton dos = new EjemploJFrameJButton( "Ventana 02" );
    } 
}