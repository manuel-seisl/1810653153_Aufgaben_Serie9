package Aufgabe1;

import java.io.*;
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

        // Studenten aus Datei lesen

        readStudents();

    }

    public static void readStudents(){

        File file = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Student> students = new ArrayList<Student>();

        try {

            file = new File("students.txt");

            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            students = (ArrayList<Student>) ois.readObject();
            ois.close();

        } catch (Exception ex){
            ex.printStackTrace();
        }

        for (Student student : students){
            System.out.println(student.toString());
        }

    }

    public static void saveStudents(ArrayList<Student> students){

        File file = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {

            file = new File("students.txt");

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

    @Override
    public String toString() {
        return "Vorname: " + firstName + " Nachname: " + lastName + " Alter: " + age + " Matrikelnummer: " + matrikelNummer + " Nationalität: " + nationality;
    }
}
