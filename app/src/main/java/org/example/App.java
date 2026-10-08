package org.example;

public class App {
    public static void main(String[] args) {

        String studentName = "JSP";
        int mark1 = 95;
        int mark2 = 100;
        int mark3 = 97;

        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;

        System.out.println("Student Name: " + studentName);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A+");
        } else if (average >= 80) {
            System.out.println("Grade: A");
        } else if (average >= 70) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
    }
}
