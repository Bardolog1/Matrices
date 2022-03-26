public class EjemploSumarFilasColumnas {
    public static void main(String[] args) {
        int sumFila,sumColu;


        int [][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int i = 0; i < a.length; i++) {
            sumColu=0;
            sumFila=0;
            for (int j = 0; j < a[i].length; j++) {
            sumFila += a[i][j];
            sumColu+=a[j][i];
            }
            System.out.println("Total fila " + i+" es: "+sumFila);
            System.out.println("Total Columna " +i+" es: "+sumColu);

        }

    }
}
