public class EjemploMatricesTranspuestas {
    public static void main(String[] args) {
        int[][]matriz ={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };

        System.out.println("Matriz Original");
        for (int[] mat :matriz){
            for (int matc:mat){
                System.out.print(matc+"\t");

            }
            System.out.println();
        }
        System.out.println("Matriz traspuesta");
        int aux;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }
        for (int[] mat :matriz){
            for (int matc:mat){
                System.out.print(matc+"\t");

            }
            System.out.println();
        }

        
    }
}
