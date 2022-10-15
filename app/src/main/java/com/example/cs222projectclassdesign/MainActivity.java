package com.example.cs222projectclassdesign;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Allow network access on the main thread
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        setContentView(R.layout.activity_main);

        Log.println(Log.DEBUG, "StudentApp", "MainActivity onCreate");

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
    jack.print();
    jack.printCourses();


    }
}