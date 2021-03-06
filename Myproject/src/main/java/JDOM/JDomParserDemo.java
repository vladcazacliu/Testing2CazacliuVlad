package JDOM;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JDomParserDemo {
    public static void main(String[] args) {

        try {
            File inputFile = new File("students.xml");
            SAXBuilder saxBuilder = new SAXBuilder();
            Document document = saxBuilder.build(inputFile);

            System.out.println("Root element :" + document.getRootElement().getName());
            Element classElement = document.getRootElement();

            List<Element> studentList = classElement.getChildren();
            System.out.println("----------------------------");

            for (int temp = 0; temp < studentList.size(); temp++) {
                Element student = studentList.get(temp);
                System.out.println("\nCurrent Element :"
                        + student.getName());
//                Attribute attribute =  student.getAttribute("newattr");
                List<Attribute> attributes = student.getAttributes();
                for (Attribute attr : attributes) {
                    System.out.println("Student " + attr.getName() + "  : "
                            + attr.getValue() );
                }

                System.out.println("First Name : "
                        + student.getChildText("firstname"));
                System.out.println("Last Name : "
                        + student.getChild("lastname").getText());
                System.out.println("Nick Name : "
                        + student.getChild("nickname").getText());
                System.out.println("Marks : "
                        + student.getChild("marks").getText());
            }
        } catch(JDOMException e) {
            e.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

