import controlador.ControladorConversion;
import modelo.ConversorEuros;
import modelo.ConversorEurosPesetas;
import vista.IEurosPesetas;
import vista.TEurosPesetas;

public class TestMVTerminal {
        public static void main(String[] args) {
            // creamos el modelo de trabajo
            ConversorEuros modelo = new ConversorEurosPesetas();
            // creamos la vista
            IEurosPesetas vista = new TEurosPesetas();
            // creamos el controlador
            ControladorConversion controlador = new ControladorConversion(modelo,vista);
            vista.setControlador(controlador);
            vista.lanzar();
        }
}
