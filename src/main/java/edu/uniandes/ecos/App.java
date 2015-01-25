package edu.uniandes.ecos;

import java.util.ArrayList;

/**
 * Clase con el método principal 
 */
public class App {
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {

        ArrayList<Double> valores = new ArrayList<Double>();
        valores.add((double) 186);
        valores.add((double) 699);
        valores.add((double) 132);
        valores.add((double) 272);
        valores.add((double) 291);
        valores.add((double) 331);
        valores.add((double) 199);
        valores.add((double) 1890);
        valores.add((double) 788);
        valores.add((double) 1601);

        CalculoPromedio promedio = new CalculoPromedio();
        promedio.calcularMedia(valores);
        promedio.calcularDesviacion(valores);
        System.out.println("media " + promedio.getMedia());
        System.out.println("desviacion " + promedio.getDesviacion());

    }
}
