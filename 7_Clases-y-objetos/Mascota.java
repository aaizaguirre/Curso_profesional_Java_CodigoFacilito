public class Mascota {
 
    public String nombre;
    public String raza;
    public int edad; 

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad; 
    }
    
    void comer() {
        System.out.println(String.format("La mascota %s se encuentra comiendo.", nombre));
    }

    void dormir() {
        System.out.println(String.format("La mascota %s se encuentra durmiendo.", nombre));
    }

    void ladrar() {
        System.out.println(String.format("La mascota %s se encuentra ladrando.", nombre));
    }

}
