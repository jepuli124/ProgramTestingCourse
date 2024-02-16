package com.example;

import java.util.ArrayList;

public class DatabaseStub {
    public static class Student{
        private String id;
        private ArrayList<Integer> grades;
        public Student(String id){
            this.id = id;
            this.grades = new ArrayList<>();
        }
        public void addGrade(int grade){
            grades.add(grade);
        }
        public String getId(){
            return this.id;
        }
        public ArrayList<Integer> getGrades(){
            return this.grades;
        }
    }

    public static class Cource{
        private String id;
        private String text;
        public Cource(String id, String text){
            this.id = id;
            this.text = text;
        }
        public String getId(){
            return this.id;
        }
        public String getText(){
            return this.text;
        }
    }

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Cource> cources = new ArrayList<>();
    public DatabaseStub(){
        students.add(new Student("123"));
        students.get(0).addGrade(3);
        students.get(0).addGrade(4);
        students.add(new Student("666"));
        students.get(1).addGrade(2);
        students.get(1).addGrade(2);
        students.get(1).addGrade(2);
        students.get(1).addGrade(2);
        students.get(1).addGrade(2);
        students.get(1).addGrade(2);
        students.get(1).addGrade(2);
        students.get(1).addGrade(2);
        students.get(1).addGrade(2);
        students.get(1).addGrade(3);
        cources.add(new Cource("CT60A4160", "Ohjelmistotestauksen periaatteet"));
        cources.add(new Cource("CT60N00B", "Help 4 newbies"));
    }

    public String getCourseName(String id) {
        if(id == null) throw new NullPointerException("Null DETECTED");
        if(id.length() > 9) return "Invalid id";
        if(id.length() < 8) return "Invalid id";
        for (Cource cource : cources) {
            if(cource.getId() == id){
                return cource.getText();
            }
        } 
        return "Not Found";
    }

    public ArrayList<Integer> getGrades(String id) { 
        for (Student student : students) {
            if(student.getId() == id){
                return (ArrayList<Integer>) student.getGrades();
            }
        } 
        ArrayList<Integer> returnable = new ArrayList<>();
        returnable.add(0);
        return returnable;
    }

}
