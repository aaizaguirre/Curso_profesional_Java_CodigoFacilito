public class CondicionesPromedio {
    
    public static void main(String[] args) {
        
        int promedioMinimo = 7;
        int promedio = 16;

        if (promedio == 10) {
            System.out.println("Muchas felicidades");
        }
        else if (promedio >= promedioMinimo && promedio < 10) {
            System.out.println("Felicidades");
        }
        else if (promedio < promedioMinimo && promedio >= 0) {
            System.out.println("Es necesario repasar bloques");
        }

        else {
            System.out.printf("El promedio ingresado (%s) no es valido.", promedio);
        }

    }

}
