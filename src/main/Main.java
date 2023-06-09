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

        String cadeinit = "Curso Java, 100, 8.8, 2020-01-01, Curso Python, 130, 9.0, 2012-03-22,Curso C, 200, 6.0, 2029-1215, Curso PHP,300, 8.0 ,2004-07-24";
        List<String> listString = new ArrayList<String>(Arrays.asList(cadeinit.split(", ")));

        Stream<String> streamList = listString.stream();

        /**
         * Segundo Ejercicio
         */

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

        Optional<String> saludo = Optional.of("Hola esta es una instacia de la clase optional\n");
        System.out.println(saludo);

        /**
         * Cuarto ejercicio
         */

        InterfaceFunctSaludo staticref = Main::inicioSaludo;
        staticref.saludar();

    }



}
