package main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void inicioSaludo() {
        System.out.println("Hola desde una interface funcional");
    }

    public static void main(String[] args) {

        /**
         * Primer EJercicio
         */

        String cadeinit = "Curso Java, 100, 8.8, 2020-01-01, Curso Python, 130, 9.0, 2012-03-22, Curso C, 200, 6.0, 2029-12-15, Curso PHP, 300, 8.0, 2004-07-24";
        Course curso1 = new Course(new ArrayList<String>(Arrays.asList(cadeinit.substring(0,32).split(", "))));
        Course curso2 = new Course(new ArrayList<String>(Arrays.asList(cadeinit.substring(34,70).split(", "))));
        Course curso3 = new Course(new ArrayList<String>(Arrays.asList(cadeinit.substring(70,99).split(", "))));
        Course curso4 = new Course(new ArrayList<String>(Arrays.asList(cadeinit.substring(101,cadeinit.length()).split(", "))));

        List<Course> listCourse = new ArrayList<>();
        listCourse.add(curso1);
        listCourse.add(curso2);
        listCourse.add(curso3);
        listCourse.add(curso4);

        System.out.println("Los nombres de los cursos son:");
        Stream<Course> streamCourses = listCourse.stream();
        streamCourses
                .map(elem -> elem.getNameCurso())
                .forEach(System.out::println);

        System.out.println("\nLos cursos con horas mayores o iguales a 200 son:");
        Stream<Course> streamCoursesHours = listCourse.stream();
        streamCoursesHours
                .filter(elem -> elem.getHours() >= 200)
                .forEach(System.out::println);

        System.out.println("\nLas fechas con formao dd/mm/yyyy son:");
        Stream<Course> streamCoursesDate = listCourse.stream();
        streamCoursesDate
                .map(elem -> elem.getDateFinish().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
                .forEach(System.out::println);

        System.out.println("\nLos curos con calificación mayor a 8.5 son:");
        Stream<Course> streamCoursesScore = listCourse.stream();
        streamCoursesScore
                .filter(elem -> elem.getScore() > 8.5)
                .forEach(System.out::println);

/**
 * Segundo Ejercicio
 */
        System.out.println("\nSegundo Ejercicio\n");

        LocalDate fechaPresente = LocalDate.now();
        LocalDate fechaCumpleaños = LocalDate.parse("1994-02-18");
        Period periodo = Period.ofDays(12);
        LocalTime horaPresente = LocalTime.now();

        String fecha = fechaPresente.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String fechaFutura = fechaPresente.plus(periodo).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String fechaCumple = fechaCumpleaños.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("La fecha actual bajo el formato dd/mm/yyy es: " + fecha);
        System.out.println("La fecha en 12 dias es: " + fechaFutura);
        System.out.println("La fecha de mi cumpleaños es: " + fechaCumple);
        System.out.println("La hora actual es: " + horaPresente);

        /**
         * Tercer Ejercicio
         */
        System.out.println("\nTercer Ejercicio\n");

        Optional<String> saludo = Optional.of("Hola esta es una instacia de la clase optional\n");
        System.out.println(saludo);

        /**
         * Cuarto ejercicio
         */
        System.out.println("\nCuarto Ejercicio\n");

        InterfaceFunctSaludo staticref = Main::inicioSaludo;
        staticref.saludar();

    }



}
