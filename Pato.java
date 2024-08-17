package Animal;

public class Pato extends Ave{

    @Override
    public void locomover(){
        System.out.print("Eu me locomovo sobre 2 patas e tambem sob a água!");
    }
    @Override
    public void emitirSom(){
        System.out.print("Eu emito sons 'Quá'!");
    }
    @Override
    public void locomover(int velocidade) {
        System.out.print("Eu me locomovo sobre 2 patas sob " + velocidade + "Km/h");
    }
    @Override
    public void locomover(String terreno) {
        System.out.print("Eu me locomovo como ave no " + terreno);
    }

}
