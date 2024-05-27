package MP03_Marina.UF_5.Ejemplo_Ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana1 extends JFrame {
    public JPanel panel;

    //CONSTRUCTOR DE VENTANA
    public Ventana1(){
        setSize(500,500); //Tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Para la ejecucion al cerrar la ventana
        setTitle("Título de la ventana");  //Le damos título a lo ventana
        //setLocation(100,200);  //Establece la posición inicial de la ventana
        //setBounds(100, 200, 500, 500);  //Método que une el tamaño de la ventana(setSize) y la posicion (setLocation)de la ventana
        setLocationRelativeTo(null);  //Establecemos la ventana en el centro de la pantalla

        //this.getContentPane().setBackground(Color.BLUE);  //Establecemos el color de la ventana

        iniciarComponentes();
    }
    private void iniciarComponentes() {

        colocarPaneles();
        //colocarEtiquetas();
        colocarBotones();
    }
    private void colocarPaneles(){
        panel = new JPanel();  //Creación de un panel

        //panel.setBackground(Color.green);  //Establecer color del panel
        panel.setLayout(null);  //Desactivar el diseño del panel que viene por defecto para colocar la etiqueta donde quieras
        this.getContentPane().add(panel);  //Agregamos el panel a la ventana
    }

    private void colocarEtiquetas(){

        //Etiqueta 1 - tipo texto
        JLabel etiqueta = new JLabel(); //Creamos nuestra etiqueta (pueden ser texto o imagen)

        etiqueta.setText("Hola");  //Establecemos el texto de la etiqueta. Tambien se puede poner como parametro de entrada del constructor de etiqueta
        etiqueta.setBounds(10,10,100,40);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);  //Establecemos la alineacion horizontal del texto en la etiqueta
        etiqueta.setForeground(Color.orange);  //Color de la letra
        etiqueta.setOpaque(true);  //Desactivamos el color de fonde de la etiqueta por defecto
        etiqueta.setBackground(Color.blue);
        etiqueta.setFont(new Font("arial",Font.BOLD, 30));  //Establecer la fuente del texto
        panel.add(etiqueta);  //Agregamos la etiqueta al panel

        //Etiqueta 2 - tipo imagen
        ImageIcon imagen = new ImageIcon("C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP03_Marina\\UF_5\\Ejemplo_Ventana\\flor.jpg");
        JLabel etiqueta2 = new JLabel(new ImageIcon("C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP03_Marina\\UF_5\\Ejemplo_Ventana\\flor.jpg"));
        etiqueta2.setBounds(10,80,300,300);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),300, Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
    }
    private void colocarBotones(){
        JButton boton1 = new JButton();
        boton1.setText("Click");  //Establecer texto al botón
        boton1.setEnabled(true);  //Con true podemos interaccionar y habilitar el boton
        boton1.setMnemonic('a');  //alt + 'a' y el boton funciona
        boton1.setBounds(100,100,100,40);
        panel.add(boton1);
    }
}
