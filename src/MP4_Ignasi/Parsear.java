/*package MP4_Ignasi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.print.Doc;
import java.io.File;
import java.io.IOException;

public class Parsear {
    public static void main(String[] args) {
        try {
            // Cargar el archivo HTML
            File input = new File("ejemplo.html");
            Document doc = Jsoup.parse(input, "UTF-8", "");

            // Mostrar la estructura en forma de árbol
            mostrarEstructura(doc, 0);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarEnlaces(Document doc){
        Elements links = doc.select("a");

        for(Element link: links){
            System.out.println("Enlace" + link.attr("href"));
        }
    }

    public static void mostrarEncapsulamiento(Document doc){
        for (int i = 1; i <= 6; i++) {
            Elements encapçalaments = doc.select("h" + i);
            for (Element encapçalament : encapçalaments) {
                System.out.println("Nivell d'encapçalament: H" + i + ", Contingut: " + encapçalament.text());
            }
        }


        private static void mostrarEstructura(Element element, int nivel) {
        String tabulaciones = " ".repeat(nivel * 4); // Añade indentación basada en el nivel
        System.out.println(tabulaciones + element.tagName());
        Elements hijos = element.children();

        for (Element hijo : hijos) {
            mostrarEstructura(hijo, nivel + 1);
        }
    }
}*/


