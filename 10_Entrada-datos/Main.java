import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // La clase "Scanner" recibe la entrada del usuario desde la consola. 
        // Creación de una instancia "scan" de la clase "Scanner", que recibe como argumento "System.in" o entrada estándar (consola).
        Scanner scan = new Scanner(System.in);
        
        System.out.println("¿Cuál es tu nombre?");
        // El método "nextLine()" lee la siguiente línea de entrada del usuario. 
        String nombre = scan.nextLine();

        System.out.println("¿Cuál es tu edad?");
        // Para convertir la entrada a un entero se usa el método "parseInt" de la clase "Integer".
        int edad = Integer.parseInt(scan.nextLine());

        System.out.println("¿En qué año naciste?");
        // Otro método de recibir como entrada un entero.
        int añoNacimiento = scan.nextInt();

        scan.nextLine();

        System.out.println("¿Cuál es tu altura");
        // Para recibir como entrada un float.
        float altura = scan.nextFloat();

        scan.nextLine();

        System.out.println("¿El curso es de tu agrado? (si/no)");
        // Para recibir como entrada un booleano: boolean valor = scan.nextBoolean();
        // Otra forma, limitando las respuestas del usuario:
        boolean valor = scan.nextLine().equals("si");

        System.out.println(String.format("Hola %s. Tienes %d años y naciste el %d. Mides %.2f m. Te gusta el curso: %b", nombre, edad, añoNacimiento, altura, valor));

        // Cerrar el objeto Scanner.
        scan.close();

    }
    
}
