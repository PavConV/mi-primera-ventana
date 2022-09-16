package org.iesfm.ventana;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setBounds(10, 10, 200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Este es el panel principal
        JPanel mainPanel = new JPanel();
        // Este es un componente de tipo etiqueta
        JLabel nameLabel = new JLabel("Nombre");
        /*
        // Añadimos la etiqueta al panel
        panel.add(label);
        // Hacemos que dentro del panel aparezca la etiqueta
        f.setContentPane(panel); */

        // Cambio el color
        nameLabel.setForeground(Color.WHITE);
        // Lo añado al panel principal
        mainPanel.add(nameLabel);

        // Creo el texto field
        JTextField nameT = new JTextField(18);
        // Añado el text field al panel principal
        mainPanel.add(nameT);

        JButton acceptB = new JButton("Aceptar");




    }
}
