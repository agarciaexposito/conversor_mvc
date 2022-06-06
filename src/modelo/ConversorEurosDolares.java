package modelo;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;

public class ConversorEurosDolares extends ConversorEuros {
    public ConversorEurosDolares() throws XPathExpressionException, IOException, ParserConfigurationException, SAXException {
        super("//Cube[@currency='USD']/@rate");
    }
    public double eurosAdolares(double cantidad) {
        return eurosAmoneda(cantidad);
    }
    public double dolaresAeuros(double cantidad) {
        return monedaAeuros(cantidad);
    }
}
