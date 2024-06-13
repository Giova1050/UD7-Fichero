package net.salesianos.Ejers4;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        MesaDos mesaDos = new MesaDos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Nueva mesa");
            System.out.println("2. Mostrar todas las mesas almacenadas");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el color de la mesa: ");
                    String color = scanner.next();
                    System.out.print("Ingrese el número de patas de la mesa: ");
                    int numPatas = scanner.nextInt();
                    Mesa mesa = new Mesa(color, numPatas);
                    try {
                        mesaDos.guardarMesa(mesa);
                        System.out.println("Mesa guardada con éxito!");
                    } catch (IOException e) {
                        System.out.println("Error al guardar la mesa: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        List<Mesa> mesas = mesaDos.obtenerTodasLasMesas();
                        System.out.println("Mesas almacenadas:");
                        for (Mesa m : mesas) {
                            System.out.println(m.toString());
                        }
                    } catch (IOException e) {
                        System.out.println("Error al obtener las mesas: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
            }
           
        }
    }
}
