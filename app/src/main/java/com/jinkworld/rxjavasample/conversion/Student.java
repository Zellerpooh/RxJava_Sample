package com.jinkworld.rxjavasample.conversion;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Zellerpooh on 16/12/20.
 */

public class Student implements Serializable {
    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    private String name;
    private List<Course> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public static class Course {
        public Course(String courseName) {
            this.courseName = courseName;
        }

        private String courseName;

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }
    }
}
