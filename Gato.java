package Animal;

public class Gato extends Mamifero {

    @Override
    public void locomover(){
        System.out.print("Eu me locomovo andando sobre 4 patas!");
    }
    @Override
    public void emitirSom(){
        System.out.print("Eu emito som 'mial'");
    }
    @Override
    public void locomover(int velocidade) {
        System.out.print("Eu me locomovo andando sobre 4 patas na velocidade de " + velocidade + "Km/h");
    }

    @Override
    public void locomover(String terreno) {
        System.out.print("Eu me locomovo andando sobre 4 patas no " + terreno);
    }
}
