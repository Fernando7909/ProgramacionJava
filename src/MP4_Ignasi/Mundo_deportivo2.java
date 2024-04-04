package MP4_Ignasi;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import org.jsoup.Jsoup;

public class Mundo_deportivo2 {

    public static void main(String[] args) throws IOException {
        try {
            Scanner entrada = new Scanner(System.in);
            //https://www.elpais.com
            System.out.println("Introduce la url de la web");
            String web = entrada.nextLine();
            System.out.println("Introduce el tag que deseas buscar");
            String tag = entrada.nextLine();
            String html_code = getHtml(web);
            Document doc = Jsoup.parse(new File(html_code), "UTF-8", "");
            mostrarTag(doc, tag);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void mostrarTag(Document doc, String tag) {

        Elements encapçalaments = doc.getElementsByTag(tag);
        for (Element encapçalament : encapçalaments) {
            System.out.println(encapçalament.text());
        }

    }

    public static String getHtml(String url) throws IOException {
        // Obrir una connexió a la pàgina web
        BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));

        // StringBuilder per a guardar el codi HTML
        StringBuilder builder = new StringBuilder();

        // Llegir el codi HTML línia per línia
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line).append("\n");
        }

        // Tancar el lector
        reader.close();

        // Retornar el codi HTML
        return builder.toString();
    }
}
*/

