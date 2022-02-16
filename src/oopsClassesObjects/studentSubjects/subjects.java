package oopsClassesObjects.studentSubjects;

public class subjects {
    private int subjectId;
    private String subjectName;
    private int maxMarks;
    private int marksScored;

    public subjects(int subjectId, String subjectName, int maxMarks, int marksScored) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.maxMarks = maxMarks;
        this.marksScored = marksScored;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksScored() {
        return marksScored;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksScored(int marksScored) {
        this.marksScored = marksScored;
    }

    public subjects(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }



}
