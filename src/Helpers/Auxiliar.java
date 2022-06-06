package Helpers;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.net.URL;

public class Auxiliar {
    public static NodeList ejecutaXPath(String url,String expresion) throws IOException, ParserConfigurationException, SAXException, XPathExpressionException {
        URL dir = new URL(url);
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document xmlDocument = builder.parse(dir.openStream());
        XPath xPath = XPathFactory.newInstance().newXPath();
        NodeList nodeList = (NodeList) xPath.compile(expresion).evaluate(xmlDocument, XPathConstants.NODESET);
        return nodeList;
    }
    public static boolean isDouble(String valor){
        return valor.matches("^\\d+(\\d*|(.)\\d+)$");
    }
}
