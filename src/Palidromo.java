import javax.swing.*;



public class Palidromo {

    public static void main(String[] args) {


        String inring = JOptionPane.showInputDialog(null,"Ingrese un palidromo");
        boolean check=verificar(inring);

        JOptionPane.showMessageDialog(null,check);

    }

    static boolean verificar(String inputString) {
        int i = inputString.length() - 1;
        int j = 0;
        while (i != j && j < i) {
            if (inputString.charAt(j++) != inputString.charAt(i--))
                return false;
        }
        return true;
    }


}


