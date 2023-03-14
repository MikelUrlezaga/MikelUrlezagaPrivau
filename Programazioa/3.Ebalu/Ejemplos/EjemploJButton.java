package Ejemplos;
import javax.swing.*;
import java.awt.*;
public class EjemploJButton
{
    public static void main( String[] args ) 
    {
        JFrame nombreVentana= new JFrame();
        nombreVentana.setTitle( "Mi Ventana" );
        JButton btnUno = new JButton( "Uno" );
        JButton btnDos = new JButton( "Dos" );
        nombreVentana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        nombreVentana.setLayout( new FlowLayout() );
        nombreVentana.add( btnUno );
        nombreVentana.add( btnDos );
        nombreVentana.setBounds(150,150,400,400);
        nombreVentana.setVisible( true );
    }  
} 
