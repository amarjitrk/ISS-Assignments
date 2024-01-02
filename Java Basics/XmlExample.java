//XML
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XmlExample {
    public static void main(String[] args) throws Exception {
        // Parse an XML file
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File("example.xml"));

        // Normalize the XML Structure
        doc.getDocumentElement().normalize();

        // Get root node
        Element root = doc.getDocumentElement();
        System.out.println("Root element: " + root.getNodeName());
        
        // Get all elements by tag name, for example "employee"
        NodeList nList = doc.getElementsByTagName("employee");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            System.out.println("\nCurrent Element: " + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("Employee ID: " + eElement.getAttribute("id"));
                System.out.println("First Name: " + eElement.getElementsByTagName("firstName").item(0).getTextContent());
                System.out.println("Last Name: " + eElement.getElementsByTagName("lastName").item(0).getTextContent());
                System.out.println("Department: " + eElement.getElementsByTagName("department").item(0).getTextContent());
            }
        }
    }
}
