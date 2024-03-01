import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    protected List<String> lenguajes = new ArrayList<String>();

    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellido, int edad, String correo) {
        super(nombre, apellido, edad, correo);
    }

    public Profesor(String nombre, String apellido, int edad, String correo, List<String> lenguajes) {
        super(nombre, apellido, edad, correo);
        this.lenguajes = lenguajes;
    }

    public List<String> getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(List<String> lenguajes) {
        this.lenguajes = lenguajes;
    }

    public void agregaLenguaje(String lenguaje) {
        lenguajes.add(lenguaje);
    }

    public void imprimir() {
        String salida = super.toString();
        System.out.println(salida);
        System.out.println("Y sus lenguajes son: " + lenguajes);
    }

    @Override
    public String toString() {
        String salida = super.toString();
        return salida + "\nY sus lenguajes son: " + lenguajes;
    }

}
