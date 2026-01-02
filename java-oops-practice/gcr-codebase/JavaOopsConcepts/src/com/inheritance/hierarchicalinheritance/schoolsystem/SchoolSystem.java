package com.inheritance.hierarchicalinheritance.schoolsystem;

public class SchoolSystem {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s1 = new Student("Aaditya", 20, "B.Tech");
        Staff st1 = new Staff("Ramesh", 35, "Administration");

        t1.displayRole();
        System.out.println();

        s1.displayRole();
        System.out.println();

        st1.displayRole();
    }
}

