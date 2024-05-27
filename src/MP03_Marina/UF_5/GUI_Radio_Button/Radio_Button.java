package MP03_Marina.UF_5.GUI_Radio_Button;

import javax.swing.*;
import java.awt.*;

public class Radio_Button extends JFrame {
    public JPanel panel;

    //VENTANA
    public Radio_Button(){
        setBounds(500,200,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("El mejor título");

        iniciarComponentes();
    }
    public void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocalRadioBotones();
        colocarBoton();
    }
    public void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    public void colocarEtiqueta(){
        JLabel etiquetaTexto = new JLabel();
        etiquetaTexto.setText("Lenguajes:");
        etiquetaTexto.setFont(new Font("arial",Font.TRUETYPE_FONT, 15));
        etiquetaTexto.setBounds(50,70,100,40);
        panel.add(etiquetaTexto);
    }
    public void colocalRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton("Java",false);
        radioBoton1.setFont(new Font("arial",Font.TRUETYPE_FONT, 15));
        radioBoton1.setBounds(50,100,100,40);
        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("Php", false);
        radioBoton2.setFont(new Font("arial",Font.TRUETYPE_FONT, 15));
        radioBoton2.setBounds(50,130,100,40);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("C++",false);
        radioBoton3.setFont(new Font("arial",Font.TRUETYPE_FONT, 15));
        radioBoton3.setBounds(50,160,100,40);
        panel.add(radioBoton3);
    }
    public void colocarBoton(){
        JButton boton1 = new JButton();
        boton1.setBounds(50,210,100,30);
        boton1.setFont(new Font("arial",Font.TRUETYPE_FONT, 15));
        boton1.setText("Validar");
        boton1.setEnabled(true);
        panel.add(boton1);
    }
}
