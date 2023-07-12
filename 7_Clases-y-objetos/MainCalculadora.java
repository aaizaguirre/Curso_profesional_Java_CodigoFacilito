public class MainCalculadora {
    
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.suma(10, 20);

        System.out.println("El resultado es: " + resultado);

        Calculadora calculadora1 = new Calculadora();
        int resultado1 = calculadora1.suma(10, 4, 5, 6, 7, 10);
        System.out.println(resultado1);
    }

}
