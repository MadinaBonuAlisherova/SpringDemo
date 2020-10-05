package com.madinabonu.springdemo;

public class MathClass implements Classes {

    private Lectures lecture;
    public MathClass(Lectures theLecture) {
        this.lecture = theLecture;
    }

    @Override
    public String printSyllabus(){
        return "Math Class Syllabus";
    }
    @Override
    public String DisplayWeekLecture(){
        return "Math Lecture:"+ this.lecture.DisplayLecture();
    }

    //add an init method
     public void shareAnnouncement(){
         System.out.println("MathClass: shareAnnouncement() function init function is called");
     }

    //add a destroy method
    public void deleteAnnouncement(){
        System.out.println("MathClass: deleteAnnouncement() function destroy function is called");
    }
}
