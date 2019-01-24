package Aufgabe3;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import java.io.Serializable;

public class Student implements Serializable
{

    private String firstName;
    @JsonIdentityReference
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

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getMatrikelNummer(){
        return matrikelNummer;
    }

    public void setMatrikelNummer(int matrikelNummer){
        this.matrikelNummer = matrikelNummer;
    }

    public String getNationality(){
        return nationality;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }
}
