package net.salesianos.Ejers4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MesaDos {
     private static final String FICHERO_MESAS = "ud7/src/net/salesianos/Ejers4/fichero/fichero4.txt";

    public void guardarMesa(Mesa mesa) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FICHERO_MESAS, true))) {
            writer.write(mesa.toString() + "\n");
        }
    }

    public List<Mesa> obtenerTodasLasMesas() throws IOException {
        List<Mesa> mesas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FICHERO_MESAS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(" con ");
                String color = partes[0].replace("Mesa de color ", "");
                int numPatas = Integer.parseInt(partes[1].replace(" patas", ""));
                mesas.add(new Mesa(color, numPatas));
            }
        }
        return mesas;
    }
}
