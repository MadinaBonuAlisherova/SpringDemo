package com.madinabonu.springdemo;

public class EnglishClass implements Classes{

    private Lectures lecture;
    private String email;
    private String tName;
    private int phone;

    //no-arg constructor
    public EnglishClass(){
        System.out.println("Constructor: is called in English class!");
    }
    //setter
    public void setLecture(Lectures lecture) {
        System.out.println("Setter Lectures: is called in English class!");
        this.lecture = lecture;
    }

    public void setEmail(String email) {
        System.out.println(" Email Setter: is called in English class!");
        this.email = email;
    }

    public void settName(String tName) {
        System.out.println("Name Setter: is called in English class!");
        this.tName = tName;
    }

    public void setPhone(int phone) {
        System.out.println("Phone Setter: is called in English class!");
        this.phone = phone;
    }

    //getters


    public String getEmail() {
        return email;
    }

    public String gettName() {
        return tName;
    }

    public int getPhone() {
        return phone;
    }

    @Override
    public String printSyllabus(){
        return "English Class Syllabus";
    }
    @Override
    public String DisplayWeekLecture(){
        return lecture.DisplayLecture();
    }
}
