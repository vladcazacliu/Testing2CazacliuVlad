package laborator1;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreateXMLDOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbBuilder = dbFactory.newDocumentBuilder();
            Document doc = dbBuilder.newDocument();

            Element rootElement = doc.createElement("music");
            doc.appendChild(rootElement);

            Element commonObjects = doc.createElement("category");
            Attr commonAtr1 = doc.createAttribute("name");
            commonAtr1.setValue("music");
            commonObjects.setAttributeNode(commonAtr1);
            rootElement.appendChild(commonObjects);

            Element music1 = doc.createElement("music");
            Attr attr1 = doc.createAttribute("tag2ID");
            attr1.setValue("001");
            music1.setAttributeNode(attr1);
            commonObjects.appendChild(music1);

            Element music11 = doc.createElement("type");
            music11.appendChild(doc.createTextNode("Rock"));
            music1.appendChild(music11);

            Element music21 = doc.createElement("Author");
            music21.appendChild(doc.createTextNode("ZZ Top"));
            music1.appendChild(music21);

            Element music31 = doc.createElement("Namemusic");
            music31.appendChild(doc.createTextNode("La Grange"));
            music1.appendChild(music31);

            Element music41 = doc.createElement("description");
            Element list1 = doc.createElement("desc");
            Element list2 = doc.createElement("desc");
            Element list3 = doc.createElement("desc");
            list1.appendChild(doc.createTextNode("La Grange\" is a song by the American rock group ZZ Top"));
            list2.appendChild(doc.createTextNode("Top's most successful songs, it was released as a single in 1973"));
            list3.appendChild(doc.createTextNode("received extensive radio play, rising to No. 41 on the Billboard Hot 100 in June 1974"));
            music41.appendChild(list1);
            music41.appendChild(list2);
            music41.appendChild(list3);
            music1.appendChild(music41);

            Element music2 = doc.createElement("music");
            Attr attr2 = doc.createAttribute("tag2ID");
            attr2.setValue("002");
            music2.setAttributeNode(attr2);
            commonObjects.appendChild(music2);

            Element music51 = doc.createElement("type");
            music51.appendChild(doc.createTextNode("Rock "));
            music2.appendChild(music51);

            Element music61 = doc.createElement("Author");
            music61.appendChild(doc.createTextNode("Alice Cooper"));
            music2.appendChild(music61);

            Element music71 = doc.createElement("Namemusic");
            music71.appendChild(doc.createTextNode("School's Out"));
            music2.appendChild(music71);

            Element music81 = doc.createElement("description");
            Element list11 = doc.createElement("desc");
            Element list21 = doc.createElement("desc");
            Element list31 = doc.createElement("desc");
            list11.appendChild(doc.createTextNode("\"School's Out\" is a song first recorded as the title track of Alice Cooper's fifth album. ."));
            list21.appendChild(doc.createTextNode("It was released as the album's only single on April 26, 1972"));
            list31.appendChild(doc.createTextNode("It has been regarded as the band's signature song"));
            music81.appendChild(list11);
            music81.appendChild(list21);
            music81.appendChild(list31);
            music2.appendChild(music81);

            Element commonObjects1 = doc.createElement("category");
            Attr commonAtr2 = doc.createAttribute("name");
            commonAtr2.setValue("Jazz");
            commonObjects1.setAttributeNode(commonAtr2);
            rootElement.appendChild(commonObjects1);

            Element music3 = doc.createElement("music");
            Attr attr3 = doc.createAttribute("tag2ID");
            attr3.setValue("001");
            music3.setAttributeNode(attr3);
            commonObjects1.appendChild(music3);

            Element music111 = doc.createElement("type");
            music111.appendChild(doc.createTextNode("Jazz"));
            music3.appendChild(music111);

            Element music211 = doc.createElement("Author");
            music211.appendChild(doc.createTextNode("Miles Davis"));
            music3.appendChild(music211);

            Element music311 = doc.createElement("Namemusic");
            music311.appendChild(doc.createTextNode("So What"));
            music3.appendChild(music311);

            Element music4 = doc.createElement("music");
            Attr attr4 = doc.createAttribute("tag2ID");
            attr4.setValue("002");
            music4.setAttributeNode(attr4);
            commonObjects1.appendChild(music4);

            Element music411 = doc.createElement("type");
            music411.appendChild(doc.createTextNode("Jazz"));
            music4.appendChild(music411);

            Element music511 = doc.createElement("Author");
            music511.appendChild(doc.createTextNode("Louis Armstrong"));
            music4.appendChild(music511);

            Element music611 = doc.createElement("Namemusic");
            music611.appendChild(doc.createTextNode("Earl Hines West End Blues"));
            music4.appendChild(music611);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("music.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}