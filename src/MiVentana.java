import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiVentana extends JFrame {
    public MiVentana() {
    super("Mi Ventana");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cp = getContentPane();
    cp.setLayout(new FlowLayout());
    JLabel etiqueta = new JLabel("Celeste Vignardi: ");
    JTextField texto = new JTextField(20);
    JButton boton = new JButton("Saludar");
    cp.add(etiqueta);
    cp.add(texto);
    cp.add(boton);
    }
}
