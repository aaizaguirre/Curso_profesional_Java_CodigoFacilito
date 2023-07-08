public class Ejercicio {

    public static void main(String[] args) {
        
        // Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un alumno sea mayor igual a 70, en caso contrario mostrar el mensaje "Reprobado".
        int nota = 60; 
        if (nota >= 70) {   
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Reprobado");
        }

        // Dado 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
        int numero1 = 9, numero2 = 50, numero3 = 4, numeroMenor = 0;

        if (numero1 < numero2) {
            if (numero1 < numero3) {
                numeroMenor = numero1;
            }
            else {
                numeroMenor = numero3;
            }
        }
        if (numero2 < numero1) {
            if (numero2 < numero3) {
                numeroMenor = numero2;
            }
            else {
                numeroMenor = numero3;
            }
        }
        System.out.println(numeroMenor);

    }

}