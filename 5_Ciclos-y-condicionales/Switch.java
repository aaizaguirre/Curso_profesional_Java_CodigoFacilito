public class Switch {
    
    public static void main(String[] args) {
        
        String colorLuz = "amarillo";

        switch(colorLuz) {

            case "verde" :
                System.out.println("Puede continuar");
                break;
            case "rojo" :
                System.out.println("Debe detenerse");
                break;
            case "amarillo", "ambar" :
                System.out.println("Espere un momento");
                break;
            default :
                System.out.println("El color ingresado no es valido.");

        }

    }

}
