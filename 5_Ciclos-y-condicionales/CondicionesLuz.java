public class CondicionesLuz {

    public static void main(String[] args) {
        
        String colorLuz = "blue";

        if (colorLuz.equalsIgnoreCase("verde")) {
            System.out.println("Puede continuar.");
        }
        else if (colorLuz.equalsIgnoreCase("rojo")) {
            System.out.println("Debe detenerse.");
        }
        else if (colorLuz.equalsIgnoreCase("amarillo")) {
            System.out.println("Espere un momento.");
        }
        else {
            System.out.printf("El color introducido '%s' no es válido\n.", colorLuz);
        }

    }

}