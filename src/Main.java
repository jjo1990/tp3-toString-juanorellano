//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear curso
        Curso curso1 = new Curso("Estructuras de Datos", "Prof. Carlos Ruiz");

        // Agregar estudiantes
        curso1.agregarEstudiante(new Estudiante("Ana", 20, "Ingeniería en Sistemas"));
        curso1.agregarEstudiante(new Estudiante("Luis", 21, "Diseño Gráfico" ));
        curso1.agregarEstudiante(new Estudiante("Pedro", 22, "Derecho"));

        // Crear otro curso
        Curso curso2 = new Curso("Bases de Datos", "Prof. Laura Gómez");
        curso2.agregarEstudiante(new Estudiante("matias",35,"electronica"));
        curso2.agregarEstudiante(new Estudiante("Juan",35,"programacion"));

        // Imprimir cursos
        System.out.println(curso1);
        System.out.println(curso2);

    }
}