public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        boolean valor1 = 1 > 2 && true;     // "and" ambos tienen que ser V para ser V o F para ser F
        System.out.println(valor1);

        boolean valor2 = 5 > 2 || false;   // "or"
        System.out.println(valor2);

        System.out.println(!true);         // "not"

    }

}
