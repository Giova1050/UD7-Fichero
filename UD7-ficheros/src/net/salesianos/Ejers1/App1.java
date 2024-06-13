package net.salesianos.Ejers1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        String fileRoute = "ud7/src/net/salesianos/Ejers1/fichero/palabra.txt";
        
        introducirTexto(fileRoute);
    }

    public static void introducirTexto(String fileRoute) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una nueva palabra de 30 caracteres");
        String palabra = scanner.nextLine();
        if (palabra.length() < 30) {
            System.out.println("El texto tiene que tener al menos 30 caracteres. Faltan " + (30 - palabra.length())
                    + " caracteres.");
            palabra = scanner.nextLine();
        } else {
            System.out.println("Esta cadena es valida");
        }

        palabra = palabra.toUpperCase().replace(" ", "_");
        System.out.println("Texto formateado: " + palabra);

       

        try( FileWriter writer = new FileWriter(fileRoute);) {

            writer.write(palabra);
            System.out.println("Texto guardado en el fichero 'palabra'");

           
        } catch (IOException e) {
            System.out.println("Error al guardar el texto en el fichero: " + e.getMessage());
        } 
        scanner.close();

    }
}
