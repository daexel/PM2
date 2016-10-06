package aufgabenblatt1_2;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.io.*;
import org.xml.sax.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;

public class Einlesen {

	// Erstellen eines Builders, der aus der Text-Datei einen DOM-Baum aufbauen
	// kann
	public void dom_BaumErstellen() {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("sensor.xml"));
			
			Node root = (Node) document.getDocumentElement();


			NamedNodeMap attribute = root.getAttributes();
			
			for (int i = 0; i < attribute.getLength(); i++) {
				Node attribut = attribute.item(i);
				System.out.print(attribut.getNodeName() + ": " + attribut.getNodeValue());
			}

		} catch (ParserConfigurationException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (SAXException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
