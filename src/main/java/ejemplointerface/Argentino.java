package ejemplointerface;

public class Argentino extends Persona implements ContratoSaludo {

    @Override
    public void saludar() {
        System.out.println("Hola que tal!");
    }
}
