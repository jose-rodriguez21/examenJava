package main;

public class Saludo implements InterfaceFunctSaludo {

    private String mensaje;

    public Saludo() {
        System.out.println("Contructor Saludo");
    }

    public void creandoSaludo(String mensaje) {
        this.mensaje = mensaje;
    }
    @Override
    public void saludar() {
        System.out.println("Hola a todos desde una interface funcional");
    }
}
