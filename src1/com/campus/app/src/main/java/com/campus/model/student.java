package com.campus.model;

public class student {
    private int id;
    private String name;
    private String department;
    private int age;

    public student(int id, String name, String department, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }
    public student( String name, String department, int age) {
        this.name = name;
        this.department = department;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
}