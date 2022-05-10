package laborator1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class QueryXMLDOM {
    public static void main(String[] args) {
        try{
            File inputFile = new File("music.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.print("Root element : ");
            System.out.println(doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("category");
            System.out.println("------------------------------");

            for(int temp = 0; temp < nList.getLength(); temp++){
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element : ");
                System.out.print(nNode.getNodeName());

                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElment = (Element) nNode;
                    System.out.print("\nmusic : ");
                    System.out.println(eElment.getAttribute("tag2ID"));
                    NodeList Namemusic = eElment.getElementsByTagName("001");

                    for(int count = 0; count < plantNameList.getLength(); count++){
                        Node node1 = Namemusic.item(count);

                        if(node1.getNodeType() == Node.ELEMENT_NODE){
                            Element music = (Element) node1;
                            System.out.println("music type : "
                                    +music.getTextContent());
                            System.out.println("Namemusic : "
                                    +music.getAttribute("Namemusic"));
                        }
                    }
                }
            }
        }catch (Exception e){

        }
    }
}
