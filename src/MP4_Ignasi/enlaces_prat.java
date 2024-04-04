package MP4_Ignasi;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class enlaces_prat {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.prateducacio.com/lescola-prat-educacio/");

        // Obtener el HTML directamente con Jsoup
        Document document = Jsoup.connect(url.toString()).get();
        //getElementByID

        // Seleccionar los tags
        Elements headers = document.select("a");

        for(int i=0; i<headers.size(); i++){
            System.out.println(headers.get(i).attr("href"));

        }
    }
}
