package MP4_Ignasi;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParserPersona {
    public static void main(String[] args) {
        try {
            int contador = 0;
            int contador_edadlaboral = 0;

            // Crea una fábrica de constructores de documentos
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // Crea un constructor de documentos
            DocumentBuilder builder = factory.newDocumentBuilder();
            // Parsea el documento XML desde un archivo
            Document document = builder.parse("C:\\Users\\Propietario\\Desktop\\Personas.xml");

            // Normaliza el documento XML
            document.getDocumentElement().normalize();

            // Obtiene todos los elementos 'persona' en el documento
            NodeList nodeList = document.getElementsByTagName("persona");

            // Itera sobre la lista de personas
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);



                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    // Obtiene los valores de 'dni' y 'edad'
                    String dni = element.getElementsByTagName("dni").item(0).getTextContent();
                    int edad = Integer.parseInt(element.getElementsByTagName("edad").item(0).getTextContent());

                    System.out.println("DNI: " + dni + ", Edad: " + edad);

                    if (edad >= 18 && edad <= 65){
                        contador_edadlaboral++;
                    }
                    if (edad > 65){
                        contador++;
                    }
                    System.out.println("Personas con mas de 65 años: \n" + contador);
                    System.out.println("Personas con edad laboral es: \n" + contador_edadlaboral);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
