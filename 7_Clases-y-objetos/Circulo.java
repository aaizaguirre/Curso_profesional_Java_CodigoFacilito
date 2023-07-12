public class Circulo {
    
    public static final float pi = 3.14159f;      // "static": le pertenece a la clase, ya no al objeto. No se modifica con cada nueva instancia. 
    // "final": hace referencia a una constante, valor que no se puede modificar. 
    public float radio = 0f;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float area() {
        return Circulo.pi * (radio * radio);
    }

}
