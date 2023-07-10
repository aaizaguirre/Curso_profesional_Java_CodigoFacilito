// Arreglo: estructura de datos que permite almacenar datos del mismo tipo. 

public class Arreglo1 {

    public static void main(String[] args) {
        
        String nombres[];               // Declaracion de arreglo "nombres"
        nombres = new String[3];        // Se inicializa un arreglo de tamaño 3
        //String nombres[] = new String[3]; // Forma más eficiente 

        nombres[0] = "Aaron";
        nombres[1] = "Lucas";
        nombres[2] = "Mario";

        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);

        // Otra forma de declarar arreglos
        String lenguajes[] = {"Python", "Java", "C++", "JavaScript"};
        System.out.println(lenguajes[2]);

    }
    
}
