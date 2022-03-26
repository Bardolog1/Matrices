import javax.swing.*;

public class ImprimirHoSilla {

    public static void main(String[] args) {
        try {

            int tamanio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la matriz"));

            int[][] matriz = new int[tamanio][tamanio];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {


                    if (j==0 || i==matriz.length/2 || (j == matriz[i].length-1 && i>=matriz.length/2)) {
                        matriz[i][j] = 1;
                    }
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }

        }catch (Exception e){

            System.err.println("ERROR!! El tamaño es invalido error: "+e.getMessage());

        }

    }
}
