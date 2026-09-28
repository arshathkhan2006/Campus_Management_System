package com.campus.model;

public class ScholarshipStudent extends Student {
    private double scholarshipAmount;

    public ScholarshipStudent(int studentid, String studentname, int age, String department, int[] marks, double scholarshipAmount) {
        super(studentid, studentname, age, department, marks);
        this.scholarshipAmount = scholarshipAmount;
    }
    // getters and setters
    public double getScholarshipAmount() {
        return scholarshipAmount;
    }
    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }
    @Override 
    public void studentType() {
        System.out.println("Scholarship Student");
    }
    @Override 
    public void dispalyStudentInfo() {
        super.dispalyStudentInfo();
        System.out.println("Scholarship Percentage: " + scholarshipPercentage);
    }
    @Override 
    public void dispalyStudentInfo(boolean showMarks) {
        super.dispalyStudentInfo(showMarks);
    }
    @Override 
    public void generatereport(){
        System.out.println("Scholarship Student Report Card");
    }
    @Override 
    public void eligbleForScholarship() {
        System.out.println("Eligible for scholarship");
    }
}