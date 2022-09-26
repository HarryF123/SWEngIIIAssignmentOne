package model;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {
    Lecturer l = new Lecturer("Harry",21,"2001-01-03",1);

    @Test
    public void returns_correct_Id(){
        assertEquals((long)1, l.getId());
    }

    @Test
    public void returns_correct_DOB(){
        assertEquals((long)1, l.getId());
    }

    @Test
    public void returns_correct_name(){
        assert("Harry".equals(l.getName()));
    }

    @Test
    public void returns_correct_userName(){
        assert("Harry21".equals(l.getUsername(l.getName(),l.getAge())));
    }

    @Test
    public void returns_correct_dob(){
        assertEquals(DateTime.parse("2001-01-03"),l.getDOB());
    }
}