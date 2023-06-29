public class Cadenas {

    public static void main(String[] args) {
        
        // "String" no es un tipo de dato primitivo, es una clase.
        String mensaje = "Hola, mundo!";
        String mensaje2 = new String("String es una clase.");
        String mensaje3 = "String";

        System.out.println(mensaje);
        System.out.println(mensaje2);

        // Método: accion que puede realizar una clase.

        // ".length()": devuelve el numero de caracteres. 
        System.out.println(mensaje.length());
        // ".contains()": devuelve true o false si contiene otro objeto.
        System.out.println(mensaje2.contains(mensaje3));
        // ".startsWith()": deuvelve true or false si empieza con un objeto.
        System.out.println(mensaje2.startsWith(mensaje3));
        // ".endsWith()": devuelve true or false si finaliza con un objeto.
        System.out.println(mensaje2.endsWith("clase"));
        // ".concat()": une dos o mas Strings.
        System.out.println(mensaje.concat(" Bienvenido al curso."));
        // ".toUpperCase()": todas las letras en mayusculas.
        System.out.println(mensaje3.toUpperCase());
        // ".toLoweCase()":todas las letras en minusculas.
        System.out.println(mensaje.toLowerCase());
        // ".trim()": remueve los espacios del texto al inicio y al final.
        System.out.println(mensaje2.trim());
        // Es posible concatenar metodos
        System.out.println(mensaje2.toLowerCase().concat(" Fin del mensaje"));
        // ".format()": permite formar nuevos Strings a partir de distintos tipos de datos. Donde "%s" indica donde se reemplaza por un valor String.
        String curso = "Java";
        float version = 1.5f;
        String nuevoMensaje = String.format("Bienvenido al curso %s", curso);
        System.out.println(nuevoMensaje);
        // "%.2f" indica que se reemplazara con un float con 1 decimal despues del punto.
        nuevoMensaje = String.format("Esta es la version %.1f", version);
        System.out.println(nuevoMensaje);
        // "%d" representa un entero.
        nuevoMensaje = String.format("Bienvenido al curso de %s, cuya version es %.1f. Ya son %d alumnos!", curso, version, 2500);
        System.out.println(nuevoMensaje);
        // Otra forma de representar una impresion formateada:
        System.out.printf("Bienvenido al curso de %s, cuya version es %.1f. Ya son %d alumnos!\n", curso, version, 2500);
        // Para representar un booleano: "%b"
        System.out.printf("La respuesta es %b.\n", false);

        // ".equals()": Validar que 2 Strings sean iguales.
        System.out.println(mensaje.equals(mensaje2));
        // ".equalsIgnoreCase()": Validar que 2 Strings sean iguales, sin importar mayusculas o minusculas.
        System.out.println(mensaje.equalsIgnoreCase(mensaje3));
    }   

}