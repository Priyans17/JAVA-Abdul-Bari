package Priyansh;

class Subject {
    private String subjID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    public Subject(String subjID, String name, int maxMarks)
    {
        this.subjID = subjID;
        this.name = name;
        this.maxMarks = maxMarks;
    }
    public String getSubjID() {return subjID;}
    public String getName() {return name;}
    public int getMaxMarks() {return maxMarks;}
    public int getMarksObtain() {return marksObtain;}

    public void setMaxMarks (int mm) {
        maxMarks=mm;
    }
    public void setMarksObtain (int m) {
        marksObtain=m;
    }
    boolean isQualified (int m ) {
        return m>= maxMarks/10*4;
    }
    public String toString() {
        return "\nSubjectID:" + subjID +"\nName: "+name+"\nMarks Obtained:" +marksObtain;
    }
}

public class StudentChallenge7 {
    public static void main(String[] args) {
        Subject subs[] = new Subject[3];
        subs[0] = new Subject("s101","DSA", 100);
        subs[1] = new Subject("s102","CN", 100);
        subs[2] = new Subject("s103","OS", 100);

        for(Subject s:subs) {
            System.out.println(s);
        }

    }
}
