package Aufgabe3;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Manuel", "Seisl", 26, 1810653153, "AT"));
        students.add(new Student("Christof", "Jori", 22, 1810653154, "AT"));

        ObjectMapper obm = new ObjectMapper();

        try {
            obm.writeValue(new File("test.json"), students);
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }

}
