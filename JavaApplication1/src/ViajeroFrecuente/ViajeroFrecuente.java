/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViajeroFrecuente;

/**
 *
 * @author lia-lb-05
 */
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
        if (millasACanjear >= this.millas){
            this.millas -= millasACanjear;
            return millas;
        } else {
            return null;          
        }         
    }
}
    