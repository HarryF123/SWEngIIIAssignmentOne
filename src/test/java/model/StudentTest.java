package model;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s = new Student("Harry", "Freney",21,"2001-01-03",1);

    @Test
    public void returns_correct_Id(){
        assertEquals((long)1, s.getId());
    }

    @Test
    public void returns_correct_DOB(){
        assertEquals((long)1, s.getId());
    }

    @Test
    public void returns_correct_name(){
        assert("Harry".equals(s.getFirstName()));
    }

    @Test
    public void returns_correct_userName(){
        assert("HarryFreney21".equals(s.getUsername()));
    }

    @Test
    public void returns_correct_dob(){
        assertEquals(DateTime.parse("2001-01-03"),s.getDOB());
    }
}