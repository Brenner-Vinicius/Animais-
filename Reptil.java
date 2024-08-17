package Animal;

public class Reptil extends Animal{

    @Override
    public void locomover(){
        System.out.print("Eu me locomovo como reptil!");
    }
    @Override
    public void emitirSom(){
        System.out.print("Eu emito sons de reptil!");
    }
    @Override
    public void locomover(int velocidade) {
        System.out.print("Eu me locomovo como reptil na velocidade de " + velocidade + "Km/h");
    }

    @Override
    public void locomover(String terreno) {
        System.out.print("Eu me locomovo como reptil no " + terreno);
    }
}
