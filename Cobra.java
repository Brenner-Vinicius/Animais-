package Animal;

public class Cobra extends Reptil{

    @Override
    public void locomover(){
        System.out.print("Eu me locomovo rastejando!");
    }
    @Override
    public void emitirSom(){
        System.out.print("Eu emito som 'sibilar'!");
    }
    @Override
    public void locomover(int velocidade) {
        System.out.print("Eu me locomovo rastejando na velocidade de " + velocidade + "Km/h");
    }

    @Override
    public void locomover(String terreno) {
        System.out.print("Eu me locomovo rastejando no " + terreno);
    }
}
