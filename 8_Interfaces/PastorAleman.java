// "implements" permite conectar con múltiples interfaces
public class PastorAleman implements Canino, Mascota {

    @Override
    public void aullar() {
        System.out.println("El pastor aleman aulla");
    }

}