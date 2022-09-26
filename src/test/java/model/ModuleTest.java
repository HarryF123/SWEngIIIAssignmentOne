package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {
    Module m = new Module("CT",100, new Lecturer("Harry",21,"2001-01-03",1));
    Lecturer l = new Lecturer("Harry",21,"2001-01-03",1);

    @Test
    public void returns_correct_Id(){
        assertEquals((long)100, m.getModuleId());
    }

    @Test
    public void returns_correct_name(){
        assertEquals("CT", m.getModuleName());
    }

    @Test
    public void returns_correct_lecturer(){
        assert((l.getName() == m.getLecturer().getName()) && (l.getId() == m.getLecturer().getId()));
    }
}