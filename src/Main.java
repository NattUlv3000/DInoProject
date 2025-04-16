public class Main {
    public static void main(String[] args) {
        ParqueJurasico parque = new ParqueJurasico();
        Dinosaurio rex = new Carnivoro("Rexy",20,8.0,10);
        Dinosaurio trike = new Herbivoro("Tricky",15,5.0,"helechos");

        //Dinosaurios creados con los atributos.

        parque.agregarDinosaurio(rex);
        parque.agregarDinosaurio(trike);



        rex.rugir();
        trike.rugir();

        parque.mostrarTodos();

        parque.alimentarTodos(2.3);
        parque.alimentarTodos(-2);

    }
}