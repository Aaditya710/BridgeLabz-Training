package com.generic.multileveluniversitycourse;

import java.util.List;

public class CourseUtility {
  public static void displayCourses(List<? extends CourseType> courses) {
      for (CourseType course : courses) {
          course.displayType();
      }
  }
}
