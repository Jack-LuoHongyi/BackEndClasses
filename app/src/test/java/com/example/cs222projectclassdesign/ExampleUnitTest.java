package com.example.cs222projectclassdesign;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void  test_construct() {
        Student jack = new Student("{\n" +
                "  \"name_\": \"Suzanne Stillion\",\n" +
                "  \"username_\": \"su\",\n" +
                "  \"password_\": \"abc\",\n" +
                "\n" +
                "  \"courses_\": [\n" +
                "    {\n" +
                "      \"name_\": \"Introduction to CS\",\n" +
                "      \"course_number_\": \"CS128\",\n" +
                "      \"link_\": \"course.illinois.edu\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name_\": \"Discrete Mathematics\",\n" +
                "      \"course_number_\": \"CS173\",\n" +
                "      \"link_\": \"course.illinois.edu\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"announcements_\": [\n" +
                "    {\n" +
                "      \"title_\": \"Welcome to CS 128!\",\n" +
                "      \"content_\": \"Howdy, welcome back.\",\n" +
                "      \"date_\": \"10/06\",\n" +
                "      \"publisher_\": \"Cowboy\",\n" +
                "      \"link_\": \"course.illinois.edu\"\n" +
                "    }    \n" +
                "  ],\n" +
                "  \"assignments_\": [\n" +
                "    {\n" +
                "      \"name_\": \"iterator\",\n" +
                "      \"description_\": \"write sth\",\n" +
                "      \"due_\": \"10/08\",\n" +
                "      \"link_\": \"course.illinois.edu\",\n" +
                "      \"status_\": \"not submitted\"\n" +
                "    }\n" +
                "  ]\n" +
                "}\n");
        //Student parameter:
        assertEquals("Suzanne Stillion", jack.getName());
        assertEquals("su", jack.getUsername());
        assertEquals("abc", jack.getPassword());

        //Course:
        Course[] expected_c = new Course[2];
        Course c1 = new Course("Introduction to CS", "CS128", "course.illinois.edu");
        Course c2 = new Course("Discrete Mathematics", "CS173", "course.illinois.edu");
        expected_c[0] = c1;
        expected_c[1] = c2;
        Course[] actual_c = jack.getCourses();

        for(int i = 0; i < expected_c.length; i++) {
            assertEquals(actual_c[i].getName(), expected_c[i].getName());
            assertEquals(actual_c[i].getCourse_number(), expected_c[i].getCourse_number());
            assertEquals(actual_c[i].getLink(), expected_c[i].getLink());
        }

        //Announcement
        Announcement[] expected_an = new Announcement[1];
        Announcement an1 = new Announcement("Welcome to CS 128!", "Howdy, welcome back.", "10/06", "Cowboy", "course.illinois.edu");
        expected_an[0] = an1;
        Announcement[] actual_an = jack.getAnnouncements();

        for(int i = 0; i < expected_an.length; i++) {
            assertEquals(actual_an[i].getContent(), expected_an[i].getContent());
            assertEquals(actual_an[i].getDate_(), expected_an[i].getDate_());
            assertEquals(actual_an[i].getLink_(), expected_an[i].getLink_());
            assertEquals(actual_an[i].getTitle_(), expected_an[i].getTitle_());
            assertEquals(actual_an[i].getPublisher_(), expected_an[i].getPublisher_());
        }

        //Assignment
        Assignment[] expected_as = new Assignment[1];
        Assignment as1 = new Assignment("iterator", "write sth", "10/08", "course.illinois.edu", "not submitted");
        expected_as[0] = as1;
        Assignment[] actual_as = jack.getAssignments();

        for(int i = 0; i < expected_an.length; i++) {
            assertEquals(actual_as[i].getDescription_(), expected_as[i].getDescription_());
            assertEquals(actual_as[i].getDue_(), expected_as[i].getDue_());
            assertEquals(actual_as[i].getLink_(), expected_as[i].getLink_());
            assertEquals(actual_as[i].getName_(), expected_as[i].getName_());
            assertEquals(actual_as[i].getStatus_(), expected_as[i].getStatus_());
        }

    }
}