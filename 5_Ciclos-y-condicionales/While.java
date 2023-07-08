public class While {
    
    public static void main(String[] args) {
        
        int i = 0;

        while (i < 11) {

            if (i == 10) {
                System.out.print(i);
            }
            else {
                System.out.print(i + ", ");
            }
            
            i++;
        }

    }

}
