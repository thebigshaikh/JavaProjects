package oopsClassesObjects.studentSubjects;

public class student {

    private final String name;
    private final int rollNos;
    private String dept;
    private subjects[] subs;

    public student(String name, int rollNos, String dept, subjects[] subs) {
        this.name = name;
        this.rollNos = rollNos;
        this.dept = dept;
        this.subs = subs;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSubs(subjects[] subs) {
        this.subs = subs;
    }

    public student(String name, int rollNos) {
        this.name = name;
        this.rollNos = rollNos;
    }


    public void showSubjects(){
        for(subjects s:this.subs){
            System.out.println(s.getSubjectId());
            System.out.println(s.getSubjectName());
            System.out.println(s.getMaxMarks());
            System.out.println(s.getMarksScored());
        }
    }

    public void addSubject(int subjectid,String subjectName, int max, int markss ){
        this.subs[3] = new subjects(subjectid, subjectName, max, markss);
    }
}



