package examen3;
import java.io.FileWriter;
import java.io.IOException;

public class Printer {

    public static void Sumas(int[] suma, String[] titulos, int id){
        try {
            FileWriter writer = new FileWriter("D:/Amigu/Universidad/Segundo Semestre/"+ id + ".txt");
            for (int i = 0; i < suma.length; i++) {
                writer.write((titulos[i+1]) + ", ");
                writer.write(Integer.toString(suma[i]) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}