
import javax.swing.JOptionPane;

public class Ejercicio_No2 {
    public static void main(String args[]) {
        int A, B, C;

         A=Short.parseShort(JOptionPane.showInputDialog("ingrese el valor de A"));
              B=Short.parseShort(JOptionPane.showInputDialog("ingrese el valor de B"));
               C=Short.parseShort(JOptionPane.showInputDialog("ingrese el valor de C"));
              

        if (A > B && A > C) {
           JOptionPane.showMessageDialog(null,A + " es mayor A.");
        } else if (B > A && B > C) {
            JOptionPane.showMessageDialog(null,B + " es mayor B.");
        } else {
           JOptionPane.showMessageDialog(null,C + " es mayor C.");
        }

    }
}
