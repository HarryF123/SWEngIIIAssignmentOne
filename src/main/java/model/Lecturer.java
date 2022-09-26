package model;

import org.joda.time.DateTime;
import java.util.ArrayList;

public class Lecturer {

    private final String name;
    private final int age;
    private final DateTime dob;
    private final long id;
    private final String username;
    private ArrayList<String> courses;
    private ArrayList<String> modules;

    public Lecturer(String name, int age, String dob, long id){
        courses = new ArrayList<>();
        modules = new ArrayList<>();
        this.name = name;
        this.age = age;
        this.dob = DateTime.parse(dob);
        this.id = id;
        this.username = getUsername(name, age);
    }

    public String getUsername(String name, int age) {return name+age;}

    public long getId(){return id;}

    public int getAge(){return age;}

    public String getName(){return name;}

    public DateTime getDOB(){return dob;}
}
