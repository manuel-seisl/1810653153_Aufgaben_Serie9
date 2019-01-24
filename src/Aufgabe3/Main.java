package Aufgabe3;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Main
{

    public static void main(String[] args){

        Student a = new Student("Manuel", "Seisl", 26, 1810653153, "AT");

        ObjectMapper obm = new ObjectMapper();

        try {
            obm.writeValue(new File("test.json"), a);
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }

}
