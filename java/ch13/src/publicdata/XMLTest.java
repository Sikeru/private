package publicdata;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLTest {

	public static void main(String[] args) {
		try {
			URL url = new URL(
					"http://openapi.seoul.go.kr:8088/71764a566f776c74383454555a444e/xml/SebcHeritageInfoCng/1/5/");
			InputStream stream = url.openStream();
			char ch = 0;

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			org.w3c.dom.Document doc = dBuilder.parse(stream);
			doc.getDocumentElement().normalize();

			System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("row");
			System.out.println("=================================");

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					System.out.println("문화재 번호 : " + getTagValue("MNG_NO", eElement));
					System.out.println("문화재 이름 : " + getTagValue("NAME_CNG", eElement));
					System.out.println("문화재 소재시 : " + getTagValue("H_CNG_CITY", eElement));
					System.out.println("문화재 소재구 : " + getTagValue("H_CNG_GU", eElement));
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getTagValue(String sTag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
		Node nValue = (Node) nlList.item(0);
		return nValue.getNodeValue();
	}

}
