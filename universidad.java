public class universidad{
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Julian David Ortiz Mlina", 18, "Tecnologia en Desarollo de Software");
        Profesor profesor = new Profesor("Daniel David Leal Lara", 30, "Software", 5000000);
        estudiante.mostrarInformacion();
        profesor.mostrarInformacion();
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + getNombre() + ", Edad: " + getEdad() + ", Carrera: " + carrera);
    }
}

class Profesor extends Persona {
    private String especialidad;
    private double salario;

    public Profesor(String nombre, int edad, String especialidad, double salario) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Profesor: " + getNombre() + ", Edad: " + getEdad() +
                ", Especialidad: " + especialidad + ", Salario: " + salario);
    }
}

interface Asistente {
    void asistirAClase();
}


class AlumnoAsistente extends Estudiante implements Asistente {
    public AlumnoAsistente(String nombre, int edad, String carrera) {
        super(nombre, edad, carrera);
    }

    @Override
    public void asistirAClase() {
        System.out.println("El alumno " + getNombre() + " está asistiendo a clase.");
    }
}
