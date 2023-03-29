package examen3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Lector {

    public int splitID(int id){
        int size = String.valueOf(id).length();
        String idString = String.valueOf(id);
        String id3String = idString.substring(3, size);
        int digitos = Integer.parseInt(id3String);
        
        return digitos;
    }

    public void ejecutar(int id) {
    {
        List<String> archivo = null;
        int[] suma = new int[3000];

        try {
            archivo = Files.readAllLines(Paths.get("C:/Users/Amigu/Downloads/emails.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int inicio = splitID(id);
        int fin = inicio + 49;

        System.out.println("Se han sumado de los renglones " + inicio + " al " + fin);

        for (int i = inicio; i <= fin; i++) {
            String[] correo = archivo.get(i).split(",");
            for (int j = 1; j < correo.length - 1; j++) {
                suma[j-1] += Integer.parseInt(correo[j]);
            }
        }

        String[] titulos = archivo.get(0).split(",");

        Printer.Sumas(suma, titulos, id);
        System.out.println("Se han guardado los datos correctamente...");
    }
}
}
