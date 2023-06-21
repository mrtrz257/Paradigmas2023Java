package Deportista;

public class Deportista {
    private String nombre;
    private String dni;
    private int numeroJugador;

    public Deportista(String nombre, String dni, int numeroJugador){
        this.nombre = nombre;
        this.dni = dni;
        this.numeroJugador = numeroJugador;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDni(){
        return dni;
    }
    public Integer getNumero(){
        return numeroJugador;
    }
}
