public class Alumno extends Persona {
    protected int lineasCodigo = 0;
    private int semestre;

    public Alumno() {
        super();
    }

    public Alumno(String nombre, String apellido, int edad, String correo) {
        super(nombre, apellido, edad, correo);
    }

    public Alumno(String nombre, String apellido, int edad, String correo, int semestre) {
        super(nombre, apellido, edad, correo);
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void agregarCodigo(int n) {
        lineasCodigo += n;
    }

    public void imprimir() {
        String salida = super.toString();
        System.out.println(salida);
        System.out.println("semestre: " + semestre + ", lineasCodigo: " + lineasCodigo);
    }

}
