package model;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course {

    private final String courseName;
    private final DateTime startDate;
    private final DateTime endDate;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;

    public Course(String courseName, String startDate, String endDate){
        modules = new ArrayList<>();
        students = new ArrayList<>();
        this.courseName = courseName;
        this.startDate = new DateTime(startDate);
        this.endDate = new DateTime(endDate);
    }

    public String getCourseName(){return courseName;}

    public DateTime getStartDate() {
        return startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void addModule(Module m){modules.add(m);}

    public ArrayList<Module> getModules(){return modules;}

    public void addStudent(Student s){students.add(s);}

    public ArrayList<Student> getStudents(){return students;}
}


