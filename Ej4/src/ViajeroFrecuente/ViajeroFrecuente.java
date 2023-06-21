
package ViajeroFrecuente;

public class ViajeroFrecuente {
    private Integer numero;
    private String dni;
    private String nombre;
    private String apellido;
    private Integer millas;

    public ViajeroFrecuente(Integer numero, String dni, String nombre, String apellido, Integer millas) {
        this.numero = numero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.millas = millas;
    }
    public Integer cantidadTotaldeMillas(){
        return millas;
    }
    public Integer acumularMillas(Integer millasRecorridas){
        this.millas += millasRecorridas;
        return millas;
    }
    public Integer canjearMillas(Integer millasACanjear){
        int millasR;
        if (millasACanjear <= this.millas){
            this.millas -= millasACanjear;
            millasR = this.millas;
        } else {
            millasR = -1;          
        }
        return millasR;
    }
    public Integer getNumero(){
        return numero;
    }
    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre+" "+apellido;
    }
    @Override
    public String toString() {
        return "\nViajero:"+" Nombre = "+nombre+" Apellido = "+apellido+" DNI = "+dni+" Numero de Viajero = "+numero+" Millas = "+millas;
    }
}
    