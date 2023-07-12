public class Perro extends Mascota {
// "extends": hereda de la clase padre "Mascota"

    // Sobre escritura de constructor.
    public Perro(String nombre, String raza, int edad) {
        // Llama a nombre, raza, edad de la clase padre
        super(nombre, raza, edad);
    }

    // Sobre escritura de método.
    @Override
    public void dormir() {
        System.out.println("El perro duerme.");
    }

}