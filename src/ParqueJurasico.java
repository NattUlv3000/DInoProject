import java.util.ArrayList;

public class ParqueJurasico {
    ArrayList<Dinosaurio> dinosaurios = new ArrayList<>();

    public void agregarDinosaurio(Dinosaurio d){
        dinosaurios.add(d);
    }

    public void mostrarTodos(){
        for (Dinosaurio d : dinosaurios){
            System.out.println(d);
        }
    }

    public void alimentarTodos(double comida){
        for (Dinosaurio d : dinosaurios){
            //El try para que se de el código para alimentar con elementos válidos.
            try {
                d.alimentar(comida);
                System.out.println(d.nombre + " ha sido alimentado con "+comida+" toneladas.");
            //El catch para que se de nuestra excepción con el mensaje.
            }catch (ComidaInvalidaException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


}
