package MP4_Ignasi;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class libros {

    public static void main(String[] args) throws IOException {

        // Ruta del archivo JSON
        String rutaArchivo = "C:\\Users\\Propietario\\Desktop\\ProgramacionJava\\src\\MP4_Ignasi\\venta_libros.json";

        // Leer el archivo JSON
        JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader(new File(rutaArchivo));
        JSONArray librosJSON = (JSONArray) parser.parse(fileReader);

        // Lista para almacenar los libros
        List<Libro> libros = new ArrayList<>();

        // Recorrer el array JSON y crear objetos Libro
        for (Object libroJSON : librosJSON) {
            JSONObject libroJSONObject = (JSONObject) libroJSON;

            // Obtener los datos del libro
            String titulo = (String) libroJSONObject.get("titulo");
            String autor = (String) libroJSONObject.get("autor");
            String isbn = (String) libroJSONObject.get("isbn");
            int paginas = ((Long) libroJSONObject.get("paginas")).intValue();
            int precio = ((Long) libroJSONObject.get("precio")).intValue();
            int ventas = ((Long) libroJSONObject.get("ventas")).intValue();

            // Crear un nuevo objeto Libro
            Libro libro = new Libro(titulo, autor, isbn, paginas, precio, ventas);

            // Agregar el libro a la lista
            libros.add(libro);
        }

        // Mostrar por consola los datos de cada libro
        for (Libro libro : libros) {
            System.out.println("**Libro:**");
            System.out.println("  Título: " + libro.getTitulo());
            System.out.println("  Autor: " + libro.getAutor());
            System.out.println("  ISBN: " + libro.getIsbn());
            System.out.println("  Páginas: " + libro.getPaginas());
            System.out.println("  Precio: " + libro.getPrecio() + "€");
            System.out.println("  Ventas: " + libro.getVentas());
            System.out.println();
        }

        System.out.println("¡Libros leídos con éxito!");
    }

}
*/