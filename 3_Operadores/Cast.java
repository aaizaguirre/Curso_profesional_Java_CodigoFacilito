public class Cast {
    
    public static void main(String[] args) {
        
        int variable1 = 50, variable2 = 10;
        float variable3 = 5.5f;
        int  resultado1;
        float resultado2;

        // "Casting": método empleado para cambiar un tipo de variable, requiere colocar antes de la variable el tipo de dato al que se quiere cambiar entre parentesis.
        resultado1 = variable1 + (int)variable3 + variable2;
        resultado2 = (float)variable1 + (float)variable2;

        System.out.println(resultado1);
        System.out.println(resultado2);

    }

}
