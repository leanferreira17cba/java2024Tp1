package ejemplointerface;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Argentino argentino = new Argentino();
        NorteAmericano norteAmericano = new NorteAmericano();

        ArrayList<Persona> arregloPersonas = new ArrayList<>();
        arregloPersonas.add(argentino);
        arregloPersonas.add(norteAmericano);

       for (Persona p : arregloPersonas) {
           p.saludar();
       }
    }
}
