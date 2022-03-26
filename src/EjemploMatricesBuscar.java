public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        int [][] enteros = new int[3][4];
        enteros[0][0]=0;
        enteros[0][1]=10;
        enteros[0][2]=20;
        enteros[0][3]=30;
        enteros[1][0]=100;
        enteros[1][1]=110;
        enteros[1][2]=120;
        enteros[1][3]=130;
        enteros[2][0]=200;
        enteros[2][1]=210;
        enteros[2][2]=220;
        enteros[2][3]=230;

        int buscar = 220;
        boolean encontrado = false;

        int i ;
        int j = 0;


        buscar :  // etiqueta del for primario
        for ( i = 0; i < enteros.length; i++) {
            for ( j = 0; j < enteros[i].length; j++) {
                if (enteros[i][j] == buscar) {
                    encontrado =true;
                    break buscar;
                }
            }
        }
        if (encontrado) {
            System.out.println(buscar+ " encontrado en la cordenada: "+i+","+j);

        }else{

            System.out.println("No se encontro elemento");

        }
    }
}
