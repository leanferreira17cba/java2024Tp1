package ejemplointerface;

public class NorteAmericano extends Persona implements ContratoSaludo {

    @Override
    public void saludar() {
        System.out.println("Good morning!");
    }
}
