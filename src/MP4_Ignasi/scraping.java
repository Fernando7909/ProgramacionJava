package MP4_Ignasi;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class scraping {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.europarl.europa.eu/meps/en/197490/MAGDALENA_ADAMOWICZ/home");

        // Obtener el HTML directamente con Jsoup
        Document document = Jsoup.connect(url.toString()).get();

        //document.getElementById()
        // Seleccionar todos los elementos <p>
        Elements paragraphs = document.select("span.sln-member-name");

        // Iterar sobre todos los elementos <p> y extraer el texto
        for (Element paragraph : paragraphs) {
            System.out.println(paragraph.text());
        }
    }
}
