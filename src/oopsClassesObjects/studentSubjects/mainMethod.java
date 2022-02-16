package oopsClassesObjects.studentSubjects;

public class mainMethod {
    public static void main(String[] args) {
//        Array of references where every element in the array refers to the subject object
        subjects[] subs_Basil = new subjects[4];
        subs_Basil[0] = new subjects(1, "Maths", 100, 70);
        subs_Basil[1] = new subjects(2, "English", 100, 80);
        subs_Basil[2] = new subjects(3, "Science", 100, 90);

        student Basil = new student("Basil", 1, "CS", subs_Basil);
        Basil.addSubject(3, "Geo", 100, 100);
        Basil.showSubjects();




    }

}
