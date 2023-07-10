public class ArregloForEach {
    
    public static void main(String[] args) {
        
        int calificaciones[] = {9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
        int suma = 0;

        // Usado cuando necesitamos unicamente recorrer un arreglo por completo y obtener sus valores
        // "Por cada valor dentro del arreglo"
        for(int valorPorIndice : calificaciones) {

            suma += valorPorIndice;

        }

        System.out.println(suma);

    }

}
