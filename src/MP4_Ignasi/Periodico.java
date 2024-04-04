package MP4_Ignasi;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class Periodico {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.elpais.com");

        // Obtener el HTML directamente con Jsoup
        Document document = Jsoup.connect(url.toString()).get();
        //getElementByID

        // Seleccionar los tags
        Elements titulares= document.select("h2");
        StringBuilder contenidoCompleto = new StringBuilder();


        for(int i=0; i<titulares.size(); i++){
            contenidoCompleto.append(titulares.get(i).text()).append("\n");
            System.out.println(titulares.get(i).text());
        }


        // Escribimos el archivo
        FileUtils.writeStringToFile(new File("C:\\Users\\Propietario\\Desktop\\archivoPeriodico.txt"), contenidoCompleto.toString());


    }
}