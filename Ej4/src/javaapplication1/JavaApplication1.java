
package javaapplication1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ViajeroFrecuente.ViajeroFrecuente;

public class JavaApplication1 {
    public static void main(String[] args) {
        ArrayList<ViajeroFrecuente> viajeros = new ArrayList<ViajeroFrecuente>();
        viajeros.add(new ViajeroFrecuente(1, "266", "Martin", "Ruiz", 5000));
        viajeros.add(new ViajeroFrecuente(2, "789", "Alex", "Aguero", 10000));
        viajeros.add(new ViajeroFrecuente(3, "556", "Nicolas", "Garcia", 150));
        viajeros.add(new ViajeroFrecuente(4, "198", "Maria", "Gonzales", 1250));
        int aa = viajeros.stream()
            .map(obj -> obj.cantidadTotaldeMillas())
            .distinct()
            .reduce(0, Integer::max);
        System.out.println("Viajero con mayor cantidad de millas:");
        int num;
        for (ViajeroFrecuente i: viajeros){
            num = i.cantidadTotaldeMillas();
            if (aa == num){
                System.out.println(i);
            }
        }
        System.out.println("=============================================");
        System.out.println("Viajeros ordenados:");
        Stream<String>listaOrd = viajeros.stream()
            .filter(d -> d.cantidadTotaldeMillas() > 200)
            .map(p -> p.getNombre());
        listaOrd.forEach(s -> System.out.println(s));
    }
}

/* 4. Mostrar los nombres de los viajeros que tienen más de 200 millas:
        Stream<String>lista = viajeros.stream()
            .filter(d -> d.cantidadTotaldeMillas() > 200)
            .map(p -> p.getNombre());
        lista.forEach(s -> System.out.println(s));

    Mostrar los datos de los viajeros ordenados por la cantidad de millas:
        Stream<String>lista = viajeros.stream()
            .sorted((o1, o2)->o1.cantidadTotaldeMillas().
                                 compareTo(o2.cantidadTotaldeMillas()))
            .map(p -> p.getNombre() +" - "+ p.cantidadTotaldeMillas());
        lista.forEach(s -> System.out.println(s));

    Mostrar viajero con mayor cantidad de millas:
    int aa = viajeros.stream()
                .map(obj -> obj.cantidadTotaldeMillas())
                .distinct()
                .reduce(0, Integer::max);
            System.out.println(aa);
 */
