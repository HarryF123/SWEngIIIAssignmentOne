package model;

import java.util.ArrayList;

public class Module {

    private final String moduleName;
    private final long moduleId;
    private final Lecturer lecturer;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String moduleName, long moduleId, Lecturer lecturer){
        courses = new ArrayList<>();
        students = new ArrayList<>();
        this.moduleName = moduleName;
        this.moduleId = moduleId;
        this.lecturer = lecturer;
    }

    public String getModuleName(){return moduleName;}

    public long getModuleId(){return moduleId;}

    public Lecturer getLecturer(){return lecturer;}

    public void addStudent(Student s){students.add(s);}
}
