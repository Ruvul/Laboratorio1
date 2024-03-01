
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {

        // Nivel 1

        /*
         * Persona p1 = new Persona("Allan", "Montero", 24, "allanmontero@hotmail.com");
         * Persona p2 = new Persona("Carlos", "Perez", 20, "carlos3000@gmail.com");
         * Persona p3 = new Persona("Enrique", "Santos", 24, "enrique77@hotmail.com");
         * 
         * List<String> alumnos = new ArrayList<>();
         * alumnos.add("Juan");
         * alumnos.add("Cristian");
         * alumnos.add("Sol");
         * 
         * Curso c1 = new Curso("Calculo", "Vespertino", "Javier Ibarra", alumnos);
         * 
         * System.out.println(p1.toString());
         * System.out.println(p2.toString());
         * System.out.println(p3.toString());
         * System.out.println();
         * System.out.println(c1.toString());
         */

        // Nivel 2

        // Alumno a1 = new Alumno("Allan", "Montero", 24, "allanmontero@hotmail.com",
        // 8);
        // Alumno a2 = new Alumno("Carlos", "Perez", 20, "carlos3000@gmail.com", 7);

        // a1.agregarCodigo(7);
        // a2.agregarCodigo(10);

        // a1.imprimir();
        // a2.imprimir();

        // Profesor p1 = new Profesor("Enrique", "Santos", 24, "enrique77@hotmail.com");
        // p1.agregaLenguaje("Python");
        // p1.agregaLenguaje("Java");
        // p1.agregaLenguaje("C");

        // p1.imprimir();

        // Nivel 3
        // List<Alumno> alumnos = new ArrayList<>();
        // alumnos.add(a1);
        // alumnos.add(a2);
        // Curso c1 = new Curso("POO", "Vespertino", p1, alumnos);

        // System.out.println(c1.toString());

        // Nivel 4
        Curso c1 = new Curso();
        Alumno a1 = new Alumno();
        Profesor p1 = new Profesor();
        List<Alumno> alumnos = new ArrayList<>();
        c1.setListaAlumnos(alumnos);
        Scanner s = new Scanner(System.in);

        boolean cond = true;

        do {

            try {
                System.out.println("HOLA!");
                System.out.println("Selecciona una opcion:\n");
                System.out.println("1. CREAR CURSO");
                System.out.println("2. CREAR ALUMNO");
                System.out.println("3. CREAR PROFESOR");
                System.out.println("4. IMPRIMIR CURSO");
                System.out.println("5. SALIR\n");

                int resp = s.nextInt();

                System.out.println("");

                if (resp == 1) { // CREAR CURSO

                    System.out.println("CREAR CURSO...");
                    System.out.println("Materia: ");
                    String materia = s.next();
                    c1.setMateria(materia);
                    System.out.print("Horario: ");
                    String horario = s.next();
                    c1.setHorario(horario);

                    System.out.println("");
                    System.out.println("Curso creado con exito!\n");

                } else {
                    if (resp == 2) { // CREA ALUMNO

                        System.out.println("CREAR ALUMNO...");
                        System.out.println("Nombre: ");
                        a1.setNombre(s.next());
                        System.out.println("Apellido: ");
                        a1.setApellido(s.next());
                        System.out.println("Correo: ");
                        a1.setCorreo(s.next());
                        System.out.println("Semestre: ");
                        a1.setSemestre(s.nextInt());

                        c1.agregaAlumno(a1);

                        System.out.println("");
                        System.out.println("Alumno creado con exito!");

                    } else {
                        if (resp == 3) { // CREA PROFESOR

                            System.out.println("CREAR PROFESOR...");
                            System.out.println("Nombre: ");
                            p1.setNombre(s.next());
                            System.out.println("Apellido: ");
                            p1.setApellido(s.next());
                            System.out.println("Correo: ");
                            p1.setCorreo(s.next());

                            c1.setProfesor(p1);

                        } else {
                            if (resp == 4) { // IMPRIMIR CURSO

                                System.out.println(c1.toString());

                            } else {
                                if (resp == 5) { // SALIR
                                    System.out.println("Adios! <3");
                                    cond = false;
                                } else {
                                    System.out.println("ERROR: Ingresa un numero valido... \n");
                                }
                            }
                        }
                    }
                }
            } catch (InputMismatchException excepcion) {
                System.out.println("");
                System.out.println("ERROR: Debe ingresar un numero de manera obligatoria\n");
                s.next();
            }

        } while (cond);

        s.close();

    }

}
