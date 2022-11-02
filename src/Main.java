import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Sonnet document = parseToObject("test.xml");
        if (document != null) {
            System.out.println(document);
        }

        toXmlFile("doc.xml", document);


    }

    public static Sonnet parseToObject(String filePath) throws JAXBException {
        Sonnet unmarshal;

        File file = new File(filePath);
        JAXBContext jaxbContext = JAXBContext.newInstance(Sonnet.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        unmarshal = (Sonnet) jaxbUnmarshaller.unmarshal(file);

        return unmarshal;
    }

    public static void toXmlFile(String filePath, Sonnet doc) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Sonnet.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(doc, new File(filePath));
    }

}