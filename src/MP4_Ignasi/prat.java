package MP4_Ignasi;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class prat {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.prateducacio.com/lescola-prat-educacio/");

        // Obtener el HTML directamente con Jsoup
        Document document = Jsoup.connect(url.toString()).get();
        //getElementByID

        // Seleccionar los tags
        Elements headers = document.select("h4.media-heading");

        String linea = "";

        for(int i=0; i<headers.size(); i++){
            if (i != headers.size() - 1) {
                linea = linea + headers.get(i).text() + ", ";
                //System.out.println(headers.get(i).text());
            }
            else {
                linea = linea + headers.get(i).text();
            }
        }
        //linea = linea.substring(0, linea.length()-1);
        System.out.println(linea);
    }
}