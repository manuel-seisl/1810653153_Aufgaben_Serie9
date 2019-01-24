package Aufgabe1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable
{

    private String firstName;
    private String lastName;
    private int age;
    private int matrikelNummer;
    private String nationality;

    public Student(String firstName, String lastName, int age, int matrikelNummer, String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.matrikelNummer = matrikelNummer;
        this.nationality = nationality;
    }

    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Manuel", "Seisl", 26, 1810653153, "AT"));
        students.add(new Student("Christof", "Jori", 22, 1810653154, "AT"));
        students.add(new Student("Hans", "Mustermann", 23, 1810653155, "AT"));
        students.add(new Student("Sepp", "Mustermann", 24, 1810653156, "AT"));
        students.add(new Student("Kurt", "Mustermann", 25, 1810653157, "AT"));

        // Studenten in Datei speichern

        saveStudents(students);

    }

    public static void saveStudents(ArrayList<Student> students){

        File file = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {

            file = new File("students.txt");

            // Datei erstellen, falls noch nicht vorhanden

            if (!file.exists()){
                file.createNewFile();
            }

            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);

            oos.writeObject(students);
            oos.close();

        } catch (Exception ex){
            ex.printStackTrace();
        }

    }

}
