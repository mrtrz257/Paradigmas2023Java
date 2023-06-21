package IDeporte;

import java.util.List;

import Deportista.Deportista;

public interface IDeporte {
    void mostar();
    void numeroJugador();
    boolean conformar(List<Deportista>integrantes);  
}
