public class Gato extends Mascota{
// "extends": hereda de la clase padre "Mascota"    

    // Sobre escritura de constructor.
    public Gato(String nombre, String raza, int edad) {
        // Llama a nombre, raza, edad de la clase padre
        super(nombre, raza, edad);
    }

    // Sobre escritura de método.
    @Override
    public void dormir() {
         // "super": permite sobreescribir un método conservando las funcionalidades de la clase padra, haciendo más robustos los métodos de la clase hija. 
        super.dormir();
        System.out.println("El gato duerme.");
    }
}
