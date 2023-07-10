public class ArreglosMultidimensionales {
    
    public static void main(String[] args) {
        
        int calificaciones[][] = new int[5][];

        calificaciones[0] = new int[1];
        calificaciones[1] = new int[2];
        calificaciones[2] = new int[3];
        calificaciones[3] = new int[4];

        calificaciones[0][0] = 10;

        calificaciones[1][0] = 10;
        calificaciones[1][1] = 12;

        calificaciones[2][0] = 11;
        calificaciones[2][1] = 15;
        calificaciones[2][2] = 13;

        calificaciones[3][0] = 17;
        calificaciones[3][1] = 12;
        calificaciones[3][2] = 13;
        calificaciones[3][3] = 14;

        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {

            for (int curso = 0; curso < calificaciones[estudiante].length; curso++) {

                System.out.println(String.format("La nota del alumno %d es %d", estudiante, curso));

            }

        }

    }

}
