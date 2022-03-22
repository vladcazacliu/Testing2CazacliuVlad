package laborator1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class SAXQueryDemo {
    public static void main(String[] args) {
        try {
            File inputFile = new File("music.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler2 userHandler = new UserHandler2();
            saxParser.parse(inputFile, userHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class UserHandler2 extends DefaultHandler {

    boolean bType = false;
    boolean bAuthor = false;
    boolean bNamemusic = false;
    String rollNo = null;

    @Override
    public void startElement(String uri,
                             String localName, String qName, Attributes attributes)
            throws SAXException {

        if (qName.equalsIgnoreCase("music")) {
            rollNo = attributes.getValue("tag2ID");
        }
        if("001".equals(rollNo) && qName.equalsIgnoreCase("music")) {
            System.out.println("Start Element :" + qName);
        }
        if (qName.equalsIgnoreCase("Type")) {
            bType = true;
        } else if (qName.equalsIgnoreCase("Author")) {
            bAuthor = true;
        } else if (qName.equalsIgnoreCase("Namemusic")) {
            bNamemusic = true;
        }
    }

    @Override
    public void endElement(
            String uri, String localName, String qName) throws SAXException {

        if (qName.equalsIgnoreCase("music")) {
            System.out.println("End Element :" + qName);
        }
    }


    @Override
    public void characters(
            char ch[], int start, int length) throws SAXException {

        if (bType && ("001").equals(rollNo)) {
            System.out.println("Type: " + new String(ch, start, length));
            bType = false;
        } else if (bAuthor && ("001").equals(rollNo)) {
            System.out.println("Author: " + new String(ch, start, length));
            bAuthor = false;
        } else if (bNamemusic && ("001").equals(rollNo)) {
            System.out.println("Namemusic: " + new String(ch, start, length));
            bNamemusic = false;
        }
    }
}