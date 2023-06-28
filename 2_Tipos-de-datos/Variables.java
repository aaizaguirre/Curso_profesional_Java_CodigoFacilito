public class Variables {

    public static void main(String[] args) {
        
        int entero;
        entero = 546;
        double decimal = 13.1415;
        char caracter = 'a';
        boolean verdadero = true;

        System.out.println(entero);
        System.out.println(decimal);
        System.out.println(caracter);
        System.out.println(verdadero);

        verdadero = false;

        System.out.println(verdadero);

        // Tipos primitivos de datos (8): byte, short, int, long, char, float, double, boolean.
        // Categorias (4): enteros (byte, short, int, long), flotantes (float, double), caracteres (char), booleanos (boolean).
        
        byte byte1 = 25;     // De -128 a 127
        short corto = 32000; 
        long largo = 9223456l;

        System.out.println(largo);
        System.out.println(byte1);
        System.out.println(corto);

        float flotante = 9.8f;
        // "println" imprime el mensaje con un salto de linea.
        System.out.println(flotante);
        // "print" imprime el mensaje en la misma linea.
        System.out.print(flotante);
        System.out.println(corto);

        // Secuencia de escapes:
        // "/n": salto de linea
        System.out.print("Hola,\nagregamos un salto");
        // "/t": tabulador
        System.out.print("\tagregamos un tab\n");
        // "\\": diagonal inversa
        System.out.println("Mensaje con \\ diagonal inversa");
        // " \" ": comillas dobles
        System.out.println("Mensaje con \"comillas dobles\"");
        // " \' ": comillas simples
        System.out.println("Mensaje con \'comillas simples\'");
    }

}