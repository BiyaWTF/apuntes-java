
package nofats;

import javax.swing.JOptionPane;

public class NoFats {
    public static void main(String[] args) {
        // Mostrar un cuadro de diálogo pidiendo el peso
        String input = JOptionPane.showInputDialog("Introduce tu peso en kg:");

        // Convertir lo que el usuario escribe a número
        if (input != null) { // null si el usuario pulsa "Cancelar"
            try {
                double peso = Double.parseDouble(input);
                JOptionPane.showMessageDialog(null, "Tu peso es: " + peso + " kg");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes introducir un número válido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No introdujiste ningún valor.");
        }
    }
}
