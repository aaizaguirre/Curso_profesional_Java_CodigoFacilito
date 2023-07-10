public class EjercicioMatriz {
    
   public static void main(String[] args) {
    
      int matriz[][] = new int[5][5];

      for (int fila = 0; fila < matriz.length; fila ++ ) {

         for (int columna = 0; columna < matriz[fila].length; columna ++) {

            System.out.println(String.format("El valor de la fila %d, columna %d es %d", fila, columna,matriz[fila][columna]));

         }

      }
   } 

}
