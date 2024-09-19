package bd;

import org.entidades.DispositivoElectronico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BaseDeDatos {

    private Map map;
    private ArrayList<DispositivoElectronico> instancia;

    public BaseDeDatos() {
        instancia = new ArrayList();
        map = new HashMap();
    }

    public ArrayList<DispositivoElectronico> getInstancia() {
        return instancia;
    }

    public void setDispositivoElectronico(DispositivoElectronico dispositivoElectronico) {
        instancia.add(dispositivoElectronico);

        String key = dispositivoElectronico.getMarca() + dispositivoElectronico.getModelo() + dispositivoElectronico.getNumeroDeSerie();
        map.put(key, dispositivoElectronico);
    }

    public DispositivoElectronico getDispositivoElectronico(int indiceDispositivo) {
        //map.get() TODO:recuperar elemento en base a su key
        return instancia.get(indiceDispositivo);
    }

    public int getTamanoDeInstancia() {
        return instancia.size();
    }

    public void eliminarElemento(int posicion) {
        instancia.remove(posicion);
    }
}
