import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String profesor;
    private List<Estudiante>listadeestudiante=new ArrayList<>();

    public Curso() {
    }

    public Curso(String profesor, String nombre) {
        this.profesor = profesor;
        this.nombre = nombre;
    }

    public Curso(List<Estudiante> listadeestudiante, String profesor, String nombre) {
        this.listadeestudiante = new ArrayList<>();
        this.profesor = profesor;
        this.nombre = nombre;
    }

    // Método para agregar un estudiante
    public void agregarEstudiante(Estudiante estudiante) {

        listadeestudiante.add(estudiante);

    }
    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append("Nombre:").append(nombre).append("\n");
        sb.append("Profesor: ").append(profesor).append("\n");
        sb.append("Cantidad de alumnos:").append(listadeestudiante.size()).append("\n");
        int i = 1;
        for (Estudiante e : listadeestudiante) {
            sb.append(i++).append(". ").append(e).append("\n");
        }

        return sb.toString();
    }

}
