package MP03_Marina.UF_5.GUI_Two_Buttons;

import javax.swing.*;
import java.awt.*;

public class Two_Buttons extends JFrame {
    public JPanel panel;

    //VENTANA
    public Two_Buttons(){
        setBounds(500,200,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("El mejor título");

        iniciarComponentes();
    }
    public void iniciarComponentes(){
        colocarPanel();
        colocalBotones();
    }
    public void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
        this.getContentPane().add(panel);
    }
    public void colocalBotones(){
        JButton boton1 = new JButton();
        boton1.setBounds(100,100,100,40);
        boton1.setText("Click");
        boton1.setFont(new Font("cooper black",Font.ITALIC,20));
        boton1.setForeground(Color.blue);
        boton1.setEnabled(true);
        panel.add(boton1);

        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,40);

        ImageIcon clicAqui = new ImageIcon("C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP03_Marina\\UF_5\\GUI_Two_Buttons\\boton-clic-aqui.png");
        boton2.setIcon(new ImageIcon(clicAqui.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        boton2.setEnabled(true);
        panel.add(boton2);
    }
}
