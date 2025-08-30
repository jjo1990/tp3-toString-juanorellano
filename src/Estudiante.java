public class Estudiante extends Persona {
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String carrera) {
        this.carrera = carrera;
    }

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    @Override
    public String toString() {

            return super.toString()+ "  Carrera: " +carrera;
        }

}
