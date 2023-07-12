public class Calculadora {
            
    //  Sobrecarga de métodos
    // El primer método me permite sumar enteros.
    public int suma(int valor1, int valor2) {
        return valor1 + valor2;
    }

    // El segundo método me permite sumar flotantes.
    public float suma(float valor1, float valor2) {
        return valor1 + valor2;
    }

    // Método que me permite obtener una cantidad "n" de parámetros.
    public int suma(int... numeros) {
        int suma = 0;
        for(int numero: numeros)
            suma += numero;
        return suma; 
    }

    public static void main(String[] args) {
        
    }


}
