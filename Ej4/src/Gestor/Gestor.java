
package Gestor;
import ViajeroFrecuente.ViajeroFrecuente;
/*import java.util.ArrayList;*/
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Gestor {
    ViajeroFrecuente viaj;
    List<ViajeroFrecuente>Viajeros = Arrays.asList(
        new ViajeroFrecuente(1, "69", "Martin", "Ruiz", 5000),
        new ViajeroFrecuente(2, "87", "Alex", "Aguero", 10000)
    );
    public void mostrarViajero(Integer numero){
        int num;
        for (ViajeroFrecuente i: Viajeros){
            num = i.getNumero();
            if (numero == num){
                System.out.println(i);
            }
        } 
    }
    public void ConsultarMillas(String dni){
        String documento;
        for (ViajeroFrecuente i: Viajeros){
            documento = i.getDni();
            if (dni.equals(documento)){
                System.out.println("Cantidad de millas: "+i.cantidadTotaldeMillas());
            }
        } 
    }
    public void acumMillas(String dni, Integer cantMillas){
        String documento;
        int m;
        m=0;
        for (ViajeroFrecuente i: Viajeros){
            documento = i.getDni();
            if (dni.equals(documento)){
                m = i.acumularMillas(cantMillas);
            }
        }
        System.out.println(m);
    }
    public void canjMillas(String dni, Integer cantMillas){
        String documento;
        int m;
        m=0;
        for (ViajeroFrecuente i: Viajeros){
            documento = i.getDni();
            if (dni.equals(documento)){
                m = i.canjearMillas(cantMillas);
            }
        }
        System.out.println(m);
    }
    public void maximaCantidad(){
        int x;
        ViajeroFrecuente element = Collections.max(Viajeros, Comparator.comparingInt(ViajeroFrecuente::cantidadTotaldeMillas));
        int maxCantMillas = element.cantidadTotaldeMillas();
         for (ViajeroFrecuente i: Viajeros){
            x = i.cantidadTotaldeMillas();
            if (x == maxCantMillas){
                System.out.println("Datos de viajero con mayor cantidad de millas:");
                System.out.println(i);
            }
        }
    }
}
