public class Arreglo2 {

    public static void main(String[] args) {
        
        int calificaciones[] = {9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
        int suma = 0;

        // Ver la longitud del arreglo
        System.out.println(calificaciones.length);

        for (int indice = 0; indice < calificaciones.length; indice++) {

            int valor = calificaciones[indice];
            System.out.println(valor);
            suma += calificaciones[indice];

        }
        float promedio = suma / calificaciones.length;
        System.out.println("El promedio es "+ promedio);

    }

}
