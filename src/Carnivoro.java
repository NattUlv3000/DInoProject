public class Carnivoro extends Dinosaurio {
    int nivelFerocidad;

    public Carnivoro(String nombre, int edad, double peso, int nivelFerocidad){
        super(nombre,edad,peso);
        this.nivelFerocidad=nivelFerocidad;
    }

    @Override
    void rugir() {
        System.out.println("El carnivoro "+nombre+" ruge ferozmente.");
    }
}
