public class EjemploMatricesStringFor {
    public static void main(String[] args) {
        String[][] nombres = new String[3][2];

        nombres[0][0]="Libardo";
        nombres[0][1]="Diana";
        nombres[1][0]="Capitolino";
        nombres[1][1]="Camilo";
        nombres[2][0]="July";
        nombres[2][1]="LuzMarina";


        // iterando para obtener valores con for i
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j]+"\t");
            }
            System.out.println();
        }


        // iterando para obtener datos con forich
        System.out.println("nombres con foreach");
        for (String[] fila:nombres){
            for (String columna:fila){

                System.out.print( columna+"\t");

            }
            System.out.println();

        }



    }
}
