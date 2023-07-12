import javax.swing.JOptionPane;

public class InterfazGrafica {
    
    public static void main(String[] args) {
        
        // La clase "JOptionPane" proporciona una forma de mostrar cuadros de diálogo en ventanas emergentes.
        // El método "showInputDialog" permite insertar un texto que recibirá una entrada.
        String nombre = JOptionPane.showInputDialog(null, "¿Cuál es tu nombre?");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuál es tu edad?"));

        String mensajeSalida = String.format("Hola, %s. Tienes %d años.", nombre, edad);
        // Muestra la salida en una ventana emergente. 
        JOptionPane.showMessageDialog(null, mensajeSalida);

        
    }

}
