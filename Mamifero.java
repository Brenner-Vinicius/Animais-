package Animal;

public class Mamifero extends Animal {

    @Override
    public void locomover() {
        System.out.print("Eu me locomovo como mamífero!");
    }

    @Override
    public void emitirSom() {
        System.out.print("Eu emito sons de mamífero!");
    }

    @Override
    public void locomover(int velocidade) {
        System.out.print("Eu me locomovo como mamífero na velocidade de " + velocidade + "Km/h");
    }

    @Override
    public void locomover(String terreno) {
        System.out.print("Eu me locomovo como mamífero no " + terreno);
    }
}
