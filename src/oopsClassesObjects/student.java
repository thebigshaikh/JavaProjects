package oopsClassesObjects;

import java.util.HashMap;
import java.util.Map;

public class student {
    private String name;
    private int rollNumber;
    private Map<String, Double> grades;

    public student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new HashMap<String, Double>();
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void addGrades(String course, double marks){
        this.grades.put(course,marks);
    }

    public double showGrade(String course){
        return this.grades.get(course);
    }

    public void updateGrade(String course, double marks){
        for(String c:this.grades.keySet()){
            if(c.equals(course)){
                this.grades.put(course,marks);
                return;
            }
        }
        System.out.println("Course doesn't exist in record! Please add first");
    }

    public double calculateAverage(){
        int num = this.grades.keySet().size();
        double totalMarks = 0;
        for(double marks:this.grades.values()){
            totalMarks += marks;
        }
        return totalMarks/num;
    }

    public void showAllGrades(){
        System.out.println("Grades for " +this.name);
        for(var grade:this.grades.entrySet()){
            System.out.println(grade.getKey() + " : " + grade.getValue());
        }
    }
}
