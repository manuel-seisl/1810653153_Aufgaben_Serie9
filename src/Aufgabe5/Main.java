package Aufgabe5;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main
{

    private static final String UNIVERSITY_URL = "university.xml";

    public static void main(String[] args) throws JAXBException, IOException {

        ArrayList<Student> studentsList = new ArrayList<Student>();

        // Studenten anlegen

        Student student1 = new Student("Manuel", "Seisl", 26, 1810653153, "AT");
        Student student2 = new Student("Christof", "Jori", 22, 1810653154, "AT");
        studentsList.add(student1);
        studentsList.add(student2);

        // Universität anlegen

        University university = new University("FH Kufstein", studentsList);

        // Marshalling

        JAXBContext context = JAXBContext.newInstance(University.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        m.marshal(university, System.out);
        m.marshal(university, new File(UNIVERSITY_URL));

        /*System.out.println();
        System.out.println("Output from our XML File: ");
        Unmarshaller um = context.createUnmarshaller();
        Bookstore bookstore2 = (Bookstore) um.unmarshal(new FileReader(
                BOOKSTORE_XML));
        ArrayList<Book> list = bookstore2.getBooksList();
        for (Book book : list) {
            System.out.println("Book: " + book.getName() + " from "
                    + book.getAuthor());
        }*/
    }

}
