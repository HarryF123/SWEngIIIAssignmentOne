package model;

import org.joda.time.DateTime;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course c = new Course("Computer Science & Information Technology", "2019-09-01", "2023-05-30");

    @Test
    public void returns_correct_course_name(){
        assert(c.getCourseName().equals("Computer Science & Information Technology"));
    }

    @Test
    public void returns_correct_start_date(){
        assert(c.getStartDate().equals(DateTime.parse("2019-09-01")));
    }

    @Test
    public void returns_correct_end_date(){
        assert(c.getEndDate().equals(DateTime.parse("2023-05-30")));
    }
}