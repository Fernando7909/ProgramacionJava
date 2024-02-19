package MP4_Ignasi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        try {
            String url = "https://es.wikipedia.org/wiki/Anexo:Reyes_visigodos";
            Document doc = Jsoup.connect(url).get();

            Elements elements = doc.select("td li");

            for (Element element : elements) {
                String texto = element.text();
                System.out.println(texto);
                // Aquí puedes realizar la lógica adicional para procesar cada elemento
                // Por ejemplo, puedes seguir navegando en el DOM desde este punto si es necesario
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
