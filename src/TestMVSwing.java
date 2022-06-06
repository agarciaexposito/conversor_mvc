
import controlador.ControladorConversion;
import modelo.ConversorEuros;
import modelo.ConversorEurosPesetas;
import vista.FEurosPesetas;
import vista.IEurosPesetas;

import javax.swing.*;

public class TestMVSwing {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                flatDark();
                // creamos el modelo de trabajo
                ConversorEuros modelo = new ConversorEurosPesetas();
                // creamos la vista
                IEurosPesetas vista = new FEurosPesetas();
                // creamos el controlador
                ControladorConversion controlador = new ControladorConversion(modelo,vista);
                vista.setControlador(controlador);
                vista.lanzar();
            }
        });
    }

    private static void flatDark() {
        try {
            UIManager.setLookAndFeel ("com.formdev.flatlaf.FlatDarkLaf");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
