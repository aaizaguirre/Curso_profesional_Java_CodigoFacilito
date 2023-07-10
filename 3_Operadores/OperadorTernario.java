public class OperadorTernario {
    
    public static void main(String[] args) {
        
        boolean mensaje = 5 > 9;

        // Si ocurre esto, entonces esto o esto. Se expresa con "?"
        String valor = mensaje == true ? "Es mayor" : "Es menor";
        System.out.println(valor);

    }

}
