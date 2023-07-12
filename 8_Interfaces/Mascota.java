public interface Mascota {
    
    // "default": el método tiene una implementación predeterminada y no es obligatorio que las clases que implementan la interfaz lo sobrescriban. 
    public default void saluda() {
        System.out.println("Saludo de mascota");
    };

}
