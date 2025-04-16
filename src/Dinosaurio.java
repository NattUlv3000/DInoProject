abstract class Dinosaurio {
    protected String nombre;
    private int edad;
    private double peso;

    //Constructor para todos los dinosaurios en general
    public Dinosaurio(String nombre, int edad, double peso) {
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
    }


    abstract void rugir();

    @Override

    public String toString(){
        return nombre + "(" + edad+ " años, " +peso+ " toneladas.)";
    }

    public void alimentar(double comida)throws ComidaInvalidaException{
        if (comida < 0){
            //Mensaje de nuestra excepción
            throw new ComidaInvalidaException("Cantidad de comida inválida para "+nombre+ ":"+comida);
        }
        this.peso=peso;
    }
}
