package MP03_Marina.UF_5.GUI_Dropdown;

import javax.swing.*;
import java.awt.*;

public class Dropdown extends JFrame {
    public JPanel panel;
    public JComboBox<String> listaDesplegable;
    public JLabel etiqueta;

    //CONSTRUCTOR DE VENTANA
    public Dropdown(){
        setSize(500,350); //Tamaño de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //Para la ejecucion al cerrar la ventana
        setTitle("ComboBox Example");  //Le damos título a lo ventana
        setLocationRelativeTo(null);  //Establecemos la ventana en el centro de la pantalla

        iniciarComponentes();
    }
    private void iniciarComponentes() {

        colocarPaneles();
        colocarListaDesplegable();
        colocarEtiqueta();
        colocarBoton();
    }
    private void colocarPaneles(){
        panel = new JPanel();  //Creación de un panel
        panel.setLayout(null);  //Desactivar el diseño del panel que viene por defecto para colocar la etiqueta donde quieras
        this.getContentPane().add(panel);  //Agregamos el panel a la ventana
    }
    private void colocarListaDesplegable(){
        String[] array_idiomasProgramacion = {"C", "C++", "C#", "Java", "PHP"};
        listaDesplegable = new JComboBox(array_idiomasProgramacion); // Corregir aquí
        listaDesplegable.setBounds(50,130,130,30);
        panel.add(listaDesplegable);
    }
    private void colocarEtiqueta(){
        etiqueta = new JLabel(); // Corregir aquí
        etiqueta.setText("Programming Language Selected: ");  //Establecemos el texto de la etiqueta. Tambien se puede poner como parametro de entrada del constructor de etiqueta
        etiqueta.setBounds(180,60,250,40);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);  //Establecemos la alineacion horizontal del texto en la etiqueta
        panel.add(etiqueta);  //Agregamos la etiqueta al panel
    }
    private void colocarBoton(){
        JButton boton1 = new JButton();
        boton1.setText("Show");  //Establecer texto al botón
        boton1.setEnabled(true);  //Con true podemos interaccionar y habilitar el boton
        boton1.setBounds(250,130,130,30);
        panel.add(boton1);

        boton1.addActionListener(e -> {  //el ActionListener, especifica que hace el boton al pulsarlo
            String idiomaElegido = (String) listaDesplegable.getSelectedItem();  //guardamos en la variale la opcion elegida en la lista desplegable
            etiqueta.setText("Programming Language Selected: " + idiomaElegido);  //Actualizamos el contenido de etiqueta añadiendo el idioma elegido
        });
    }
}

