import javax.swing.*;

public class ImprimirX {

    public static void main(String[] args) {
        try {

            int tamanio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño de la matriz"));

            char[][] matriz = new char[tamanio][tamanio];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == j || j + i == matriz.length - 1) {
                        matriz[i][j] = 'X';
                    } else {
                        matriz[i][j] = '_';
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
