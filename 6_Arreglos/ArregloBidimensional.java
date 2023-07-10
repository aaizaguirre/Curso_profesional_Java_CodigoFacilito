public class ArregloBidimensional {
    
    public static void main(String[] args) {
        
        // Matriz de 2 dimensiones: dos pares de corchetes, se indica [filas] x [columnas]
        int matriz [][] = new int[4][3];
        
        // Agregando un valor a la coordenada 0,0
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        System.out.println(matriz[1][2]);

        for (int posX = 0; posX < matriz.length; posX++) {

            for (int posY = 0; posY < matriz[posX].length; posY++) {

                System.out.println(matriz[posX][posY]);

            }

        }

    }

}
