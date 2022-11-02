import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Sonnet {

    private List<Author> author;

    @XmlElementWrapper(name = "lines")
    @XmlElement(name = "line")
    private List<String> lines;

    public Sonnet(){}

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return "Sonnet{" +
                "author=" + author +
                ", lines=" + lines +
                '}';
    }
}
