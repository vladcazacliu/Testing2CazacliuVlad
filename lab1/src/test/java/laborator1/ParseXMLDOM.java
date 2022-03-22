package laborator1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ParseXMLDOM {
    public static void main(String[] args) {
        try{
            File inputFile = new File("music.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuider = dbFactory.newDocumentBuilder();
            Document doc = dBuider.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element : "+doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("category");
            System.out.println("-------------------------------");

            for(int temp = 0; temp < nList.getLength(); temp++){
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : "+nNode.getNodeName());

                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement = (Element) nNode;
                    System.out.println("Music roll no : "
                            +eElement.getAttribute("002"));
                    System.out.println("Type : "
                            +eElement
                            .getElementsByTagName("type")
                            .item(0)
                            .getTextContent());
                    System.out.println("Author : "
                            +eElement
                            .getElementsByTagName("Author")
                            .item(0)
                            .getTextContent());
                    System.out.println("Namemusic : "
                            +eElement
                            .getElementsByTagName("Namemusic")
                            .item(0)
                            .getTextContent());

                    if(eElement.getElementsByTagName("description").getLength() > 0){
                        System.out.println("Descrierea : "
                                +eElement.getElementsByTagName("desc")
                                .item(0)
                                .getTextContent());
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
