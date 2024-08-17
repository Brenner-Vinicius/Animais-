package Animal;

public class Ave extends Animal{

    @Override
    public void locomover(){
        System.out.print("Eu me locomovo como ave!");
    }
    @Override
    public void emitirSom(){
        System.out.print("Eu emito sons de ave!");
    }
    @Override
    public void locomover(int velocidade) {
        System.out.print("Eu me locomovo como ave na velocidade de " + velocidade + "Km/h");
    }

    @Override
    public void locomover(String terreno) {
        System.out.print("Eu me locomovo como ave no " + terreno);
    }
}
