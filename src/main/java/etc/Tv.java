package etc;

import org.entidades.DispositivoElectronico;

public class Tv extends DispositivoElectronico {
    public void printMarca() {
        System.out.println(super.marca);
    }
}
