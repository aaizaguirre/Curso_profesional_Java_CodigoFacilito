public class MainUsuario {

    public static void main(String[] args) {
        
        Usuario codi = new Usuario("Codi", "pass");
        codi.username = "Codi1";
        codi.setPassword("pass123");

        System.out.println(codi.username);
        System.out.println(codi.getPassword());

    }
}
