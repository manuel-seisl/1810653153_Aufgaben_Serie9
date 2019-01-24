package Aufgabe5;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "at.ac.fh_kufstein")
@XmlAccessorType(XmlAccessType.FIELD)
public class University
{

    @XmlElementWrapper(name = "university")
    @XmlElement(name = "student")
    private ArrayList<Student> students;
    private String name;

    public University(String name, ArrayList<Student> students){
        this.name = name;
        this.students = students;
    }

    public University(){}

    public ArrayList<Student> getStudents(){
        return students;
    }

    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
