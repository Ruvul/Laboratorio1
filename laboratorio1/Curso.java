import java.util.List;

public class Curso {

    private String materia;
    private String horario;
    private Profesor profesor;
    private List<Alumno> listaAlumnos;

    public Curso() {
    }

    public Curso(String materia, String horario, Profesor profesor, List<Alumno> listaAlumnos) {
        this.materia = materia;
        this.horario = horario;
        this.profesor = profesor;
        this.listaAlumnos = listaAlumnos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public void agregaAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    @Override
    public String toString() {
        return "Curso: [materia=" + materia + ", horario=" + horario + ", profesor=" + profesor.toString()
                + ", \nalumnos="
                + listaAlumnos + "]";
    }

}
