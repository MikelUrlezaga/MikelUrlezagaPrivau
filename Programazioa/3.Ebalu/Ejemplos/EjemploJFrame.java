package Ejemplos;
import javax.swing.*;
public class EjemploJFrame
{
    public static void main( String[] args ) 
    {
        JFrame nombreVentana = new JFrame( "Mi Ventana" );
        nombreVentana.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        nombreVentana.setBounds(450,550,500,400);
        nombreVentana.setVisible( true );
    } 
} 
