import javax.xml.bind.annotation.XmlElement;

public class Author {

    private String lastName;
    private String firstName;
    private String nationality;
    private String yearOfBirth;
    private String yearOfDeath;

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getYearOfDeath() {
        return yearOfDeath;
    }

    public void setYearOfDeath(String yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

    @Override
    public String toString() {
        return "Author{" +
                "lastname='" + lastName + '\'' +
                ", firstname='" + firstName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", yearOfDeath='" + yearOfDeath + '\'' +
                '}';
    }
}
