package net.salesianos.Ejers2;

import java.io.FileReader;
import java.io.IOException;

public class App2 {
    public static void main(String[] args) {
        String fileRoute = "ud7/src/net/salesianos/Ejers2/fichero/fichero.txt";
        leerFichero(fileRoute);
    }

    public static void leerFichero(String fileRoute ) {
        try (FileReader reader = new FileReader(fileRoute)) {
            int caracter;
            StringBuilder salida = new StringBuilder();
            while ((caracter = reader.read()) != -1) {
                salida.append((char) caracter).append("_").append(caracter).append(", ");
            }
            System.out.println(salida.toString());
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
