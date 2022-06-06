package controlador;

import modelo.ConversorEuros;
import vista.IEurosPesetas;

public class ControladorConversion {

    private ConversorEuros modelo;
    private IEurosPesetas vista;

    public ControladorConversion(ConversorEuros modelo, IEurosPesetas vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public static final int A_EUROS = 1001;
    public static final int A_PTAS = 1002;
    public void convertir(int id){
        double cantidad=vista.getCantidad();
        switch (id){
            case A_EUROS: vista.setResultado(id,modelo.monedaAeuros(cantidad));break;
            case A_PTAS: vista.setResultado(id,modelo.eurosAmoneda(cantidad));break;
            default: vista.setResultado(id,0);break;
        }
    }
}
