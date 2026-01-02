package com.inheritance.multilevelinheritance.coursesystem;

public class CourseSystem {
    public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse("Java Full Stack", 120, "Udemy", true, 15000, 20 );

        course.courseDetails();
    }
}

