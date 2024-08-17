package Animal;

public abstract class Animal {

    public void locomover(){
        System.out.print("Eu me locomovo!");
    }

    public void emitirSom(){
        System.out.print("Eu emito sons!");
    }

    public void locomover(int velocidade){
        System.out.print("Eu me locomovo na velocidade de " + velocidade + "Km/h");
    }

    public void locomover(String terreno){
        System.out.print("Eu me locomovo no " + terreno);
    }
}
