package MP03_Marina.UF_5.GUI_Text;

import javax.swing.*;
import java.awt.*;

public class GuiText extends JFrame {
    public JPanel panel;

    //VENTANA
    public GuiText(){
        setBounds(500,200,500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //getContentPane().setBackground(Color.blue);

        iniciarComponentes();
    }
    public void iniciarComponentes(){
        colocarPanel();
        colocarCajasTexto();
    }
    public void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(450,150,400,400);
        this.getContentPane().add(panel);
    }
    public void colocarCajasTexto(){
        JTextField cajaTexto1 = new JTextField();  //Caja de texto de una sola línea
        cajaTexto1.setBounds(50,50,200,30);
        cajaTexto1.setText("Escribe tu E-Mail");
        panel.add(cajaTexto1);

        JTextField cajaTexto2= new JTextField();  //Caja de texto de una sola línea
        cajaTexto2.setBounds(50,100,350,60);
        cajaTexto2.setText("First Name please");
        cajaTexto2.setFont(new Font("arial",Font.TRUETYPE_FONT, 25));
        cajaTexto2.setForeground(Color.blue);
        panel.add(cajaTexto2);
    }
}
