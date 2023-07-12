public class Cuadrado extends Figura {
    
    private float lado;

    public Cuadrado() {
        this.numeroLados = 4;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return this.lado;
    }

    @Override
    public float area() {
        return (lado * lado);
    }

}
