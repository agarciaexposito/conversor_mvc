package modelo;

import Helpers.Auxiliar;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

public class ConversorEuros {
    private double cambio;
    private static final String WEB_CONVERSIONES="https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml";
    public ConversorEuros ( double valorCambio ) {
        // valor en la moneda de 1 euro
        cambio = valorCambio;
    }
    public ConversorEuros ( String xPath ) throws XPathExpressionException, IOException, ParserConfigurationException, SAXException {
        // valor en la moneda de 1 euro
        cambio = Double.parseDouble(Auxiliar.ejecutaXPath(WEB_CONVERSIONES,xPath).item(0).getNodeValue());
    }
    public double eurosAmoneda (double cantidad) {
        return cantidad * cambio;
    }
    public double monedaAeuros (double cantidad) {
        return cantidad / cambio;
    }
}
