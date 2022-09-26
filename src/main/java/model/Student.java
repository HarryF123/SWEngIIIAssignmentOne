package model;

import java.util.ArrayList;
import org.joda.time.*;

public class Student {

    private final String fname;

    private final String lname;
    private final int age;
    private final DateTime dob;
    private final long id;
    private final String username;
    private ArrayList<String> courses;
    private ArrayList<String> modules;

    public Student(String fname, String lname, int age, String stringDob, long id){
        courses = new ArrayList<>();
        modules = new ArrayList<>();
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.dob = DateTime.parse(stringDob);
        this.id = id;
        this.username = getUsername();
    }

    public String getUsername() {return getFirstName()+getLastName()+getAge();}

    public long getId(){return id;}

    public int getAge(){return age;}

    public String getFirstName(){return fname;}

    public String getLastName(){return lname;}

    public DateTime getDOB(){return dob;}
}
