package vista;

import controlador.ControladorConversion;

public interface IEurosPesetas {
    void lanzar();
    void setControlador(ControladorConversion controlador);
    double getCantidad();
    void setResultado(int id,double resultado);
}
