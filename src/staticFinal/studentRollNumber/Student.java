package staticFinal.studentRollNumber;

public class Student {
    private String name;
    private  String roll_number;
    private static int count = 1;

    Student(String name){
        this.name =name;
//        assignRollNumber();
        this.roll_number = "Univ-2020-" + Integer.toString(count);
        incrementCount();
    }

    public static void incrementCount(){
        count += 1;
    }

    public void assignRollNumber(){
        this.roll_number = "Univ-2020-" + Integer.toString(count);
        incrementCount();
    }

    public String get_roll_number(){
        return this.roll_number;
    }



}
