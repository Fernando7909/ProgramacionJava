package MP4_Ignasi;

import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;

public class Mundo_deportivo {
    public static void main(String[] args) {
        try {
            // Cargar el archivo HTML
            File input = new File("Mundo Deportivo _ Noticias deportivas_ Fútbol, motor, tenis y más.html");
            Document doc = Jsoup.parse(input, "UTF-8", "");
            Scanner lector = new Scanner(System.in);
            String tag = lector.nextLine();
            System.out.println("Introduce el nombre del tag que deseen buscar: ");

            // Mostrar la estructura en forma de árbol
            mostrarTag(doc,tag);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void mostrarTag(Document doc, String tag) {

        Elements encapçalaments = doc.getElementsByTag(tag);
        for (Element encapçalament : encapçalaments) {
            System.out.println("Nivell d'encapçalament: " + tag + ", Contingut: " + encapçalament.text());
        }
    }
}

