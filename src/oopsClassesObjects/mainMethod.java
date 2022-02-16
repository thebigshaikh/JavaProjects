package oopsClassesObjects;

public class mainMethod {
    public static void main(String[] args) {

        student Basil = new student("Basil", 1);
        Basil.addGrades("Maths", 100);
        Basil.addGrades("Science", 90);
        Basil.addGrades("Computer Science", 90);

        System.out.println("Science Grade " + Basil.showGrade("Science"));

        Basil.updateGrade("Science",95);
        System.out.println("Science Grade " + Basil.showGrade("Science"));

        Basil.updateGrade("English", 99);
        Basil.addGrades("English", 90);
        Basil.updateGrade("English", 80);
        System.out.println("English Grade " + Basil.showGrade("English"));

        System.out.println("Average marks for " + Basil.getName()+ " is " + Basil.calculateAverage());

        student Zoya = new student("Zoya", 2);
        Zoya.addGrades("Maths",100);
        Zoya.addGrades("English",90);
        Zoya.addGrades("Science",80);

        System.out.println("Average marks for " + Zoya.getName() + " is " + Zoya.calculateAverage());

        Basil.showAllGrades();
        System.out.println("Average marks for " + Basil.getName()+ " is " + Basil.calculateAverage());

        Zoya.showAllGrades();
        System.out.println("Average marks for " + Zoya.getName() + " is " + Zoya.calculateAverage());





    }
}
