// Clase abstracta: posee por lo menos 1 método abstracto o vacío que define qué hacer pero no cómo.
public abstract class Figura {
 
    public int numeroLados;

    public Figura() {
        this.numeroLados = 0;
    }

    // Métoddo abstracto
    public abstract float area();

}
