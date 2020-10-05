package com.madinabonu.springdemo;

public class JavaClass implements Classes {
    //define a private field for dependency
    private Archive archiveLec;

    public JavaClass(){

    }
    //define a constructor for dependency injection
    public JavaClass(Archive theArchiveLec) {
        archiveLec = theArchiveLec;
    }

    @Override
    public String printSyllabus(){
        return "Java Class Syllabus";
    }
    @Override
    public String DisplayWeekLecture(){
        return archiveLec.DisplayLecture();
    }
}
