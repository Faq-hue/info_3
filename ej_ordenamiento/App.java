import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

//Archivo   |   Descripcion |   Insercion   |   Shell   |   Quicksort
//es.txt.gz |   desordenado |     null      |   7103 ms |    1326 ms
//esi.txt.gz|   invertido   |     null      |   1337 ms |    3402 ms
//eso.txt.gz|   ordenado    |     null      |   937 ms  |     null

public class App {
    public static void main(String[] args) {
        String filename = "eso.txt.gz";
        String line;
        ArrayList<String> words = new ArrayList<>();
        String [] arr;

        try {
            InputStream gzStream = new GZIPInputStream(new FileInputStream(filename));
            BufferedReader br = new BufferedReader(new InputStreamReader(gzStream, StandardCharsets.UTF_8));

            while ((line = br.readLine()) != null) {
                words.add(line);
            }

            arr = words.toArray(new String[0]);
            long start = System.currentTimeMillis(); // para medir el tiempo de ejecución

            sort.quicksort(arr, 0, arr.length-1);

            System.out.println("demora: " + (System.currentTimeMillis() - start) + "ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}