public class Usuario {
    
    // Modificadores de acceso: restringen el acceso a determinados objetos.
    // "public": cualquier otro objeto puede tener acceso al elemento.
    // "private": ningún objeto o clase ajena a esta puede tener acceso al elemento.
    public String username;         // Atributo público.
    private String password;        // Atributo privado.

    // Constructor: inicializa un objeto durante su creación.
    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }     

    // Sobrecarga de constructores
    public Usuario() {
        this.username = "";
        this.password = "";
    }

    public void saludo() {          // Método público.
        System.out.println("Hola, mi username es: " + this.username);
    }

    // getters y setters: utilizados con atributos privados.
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void establecerRol() {
        Administrador admin = new Administrador();
        admin.trabajar();
    }

    // Clases anidadas: pueden usar atributos y metodos de la clase principal. 
    public class Administrador {

        public void trabajar() {
            System.out.println("El administrador se encuentra trabajando");
        }

    }
}
