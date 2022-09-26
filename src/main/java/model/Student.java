package model;

import java.util.ArrayList;
import org.joda.time.*;

public class Student {

    private final String name;
    private final int age;
    private final DateTime dob;
    private final long id;
    private final String username;
    private ArrayList<String> courses;
    private ArrayList<String> modules;

    public Student(String name, int age, String stringDob, long id){
        courses = new ArrayList<>();
        modules = new ArrayList<>();
        this.name = name;
        this.age = age;
        this.dob = DateTime.parse(stringDob);
        this.id = id;
        this.username = getUsername(name, age);
    }

    public String getUsername(String name, int age) {return name+age;}

    public long getId(){return id;}

    public int getAge(){return age;}

    public String getName(){return name;}

    public DateTime getDOB(){return dob;}
}
