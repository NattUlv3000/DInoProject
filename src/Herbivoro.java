public class Herbivoro extends Dinosaurio{
    String plantaFavorita;

    public Herbivoro(String nombre, int edad, double peso, String plantaFavorita){
        super(nombre,edad,peso);
        this.plantaFavorita=plantaFavorita;
    }

    @Override
    void rugir() {
        System.out.println("El herbívoro "+nombre+" ruge suavemente.");
    }


}
