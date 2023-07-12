public class Main {
    
    public static void main(String[] args) {
        
        Perro lassie = new Perro("Lassie", "Collie", 4);         // Instancia: nuevo objeto creado.

        Gato bobby = new Gato("Bobby", "siames", 2);
        
        System.out.println("El nombre es: " + lassie.nombre);
        System.out.println("La raza es: " + lassie.raza);
        System.out.println("La edad es: " + lassie.edad);

        System.out.println("El nombre es: " + bobby.nombre);
        System.out.println("La raza es: " + bobby.raza);
        System.out.println("La edad es: " + bobby.edad);
        lassie.comer();
        lassie.dormir();
        lassie.ladrar();
    }

}
