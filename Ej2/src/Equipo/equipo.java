package Equipo;
import java.util.List;

import Deportista.Deportista;
import IDeporte.IDeporte;

public class equipo implements IDeporte{
    private String nombre;

    public equipo(String nombre){
        this.nombre = nombre;
    }
    public String getNombreEquipo(){
        return nombre;
    }
    @Override
    public void mostar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostar'");
    }
    @Override
    public void numeroJugador() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'numeroJugador'");
    }
    @Override
    public boolean conformar(List<Deportista> integrantes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'conformar'");
    }
    
}
