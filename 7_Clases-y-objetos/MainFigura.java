public class MainFigura {
    
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.setBase(10f);
        triangulo.setAltura(20f);

        float resultado = triangulo.area();
        System.out.println(resultado);

        Figura cuadrado = new Cuadrado();
        System.out.println(cuadrado.numeroLados);
    }

}
