package modelo;

public class ConversorEurosPesetas extends ConversorEuros{
    public static final double VALOR_CAMBIO_EU_PTS = 166.386D;
    // Adaptador de clase
    public ConversorEurosPesetas () {
        super(VALOR_CAMBIO_EU_PTS);
    }
    public double eurosApesetas(double cantidad) {
        return eurosAmoneda(cantidad);
    }
    public double pesetasAeuros(double cantidad) {
        return monedaAeuros(cantidad);
    }
}
