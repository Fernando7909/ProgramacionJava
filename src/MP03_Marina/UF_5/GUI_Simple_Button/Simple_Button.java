package MP03_Marina.UF_5.GUI_Simple_Button;

import javax.swing.*;
import java.awt.*;

public class Simple_Button extends JFrame {
    public JPanel panel;

    //VENTANA
    public Simple_Button(){
        setBounds(500,200,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Button Example");

        iniciarComponentes();
    }
    public void iniciarComponentes(){
        colocarPanel();
        colocalBoton();
    }
    public void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
        this.getContentPane().add(panel);
    }
    public void colocalBoton(){
        JButton boton1 = new JButton();
        boton1.setBounds(200,100,100,30);
        boton1.setText("Click");
        boton1.setEnabled(true);
        panel.add(boton1);
    }
}
