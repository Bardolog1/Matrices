public class EjemploMatricesSimetricas {
    public static void main(String[] args) {

        boolean sime = true;

        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        int i,j;
        i=0;
        while (i< matriz.length && sime ==true){
            j=0;
            while (j< i&& sime ==true){
                if (matriz[i][j]!=matriz[j][i]) {
                    sime =false;
                }
                j++;


            }
            i++;
        }
        if (sime) System.out.println("Es simetrica");
        else System.out.println("No es simetrica");




    }
}
