import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

public class App {
    public static void main(String[] args) {
        String filename = "es.txt.gz";
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

            sort.shell(arr);

            System.out.println("demora: " + (System.currentTimeMillis() - start) + "ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}