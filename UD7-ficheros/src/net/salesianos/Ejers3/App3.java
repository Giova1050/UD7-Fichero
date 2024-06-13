package net.salesianos.Ejers3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App3 {
    public static void main(String[] args) throws IOException {
        String fichero1 = "ud7/src/net/salesianos/Ejers1/fichero/palabra.txt";
        String fichero2 = "ud7/src/net/salesianos/Ejers2/fichero/fichero.txt";
        String fichero3 = "ud7/src/net/salesianos/Ejers3/fichero/fichero3.txt";

        fusionarArchivos(fichero1, fichero2, fichero3);
    }

    public static void fusionarArchivos(String archivo1, String archivo2, String archivoResultado) throws IOException {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(archivo1));
                BufferedReader reader2 = new BufferedReader(new FileReader(archivo2));
                BufferedWriter writer = new BufferedWriter(new FileWriter(archivoResultado))) {

            writer.write("Contenido del Fichero Uno: ");
            String linea;
            while ((linea = reader1.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }

            writer.write("Contenido del Fichero Dos: ");
            while ((linea = reader2.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }

            writer.write("Mensaje de firma: Giovanni");
        } catch (IOException e) {
            System.out.println("Error al guardar el texto en el fichero: " + e.getMessage());
        }

    }
}
