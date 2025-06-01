package CopyOfGroupTask;

public class Absence{
    Student std;
    Course crs;
    int present, sick, leave, alpha;
    AveragePresention avgpst;

    public Absence(Student std, Course crs, int present, int sick, int leave, int alpha){
        this.std = std;
        this.crs = crs;
        this.present = present;
        this.sick = sick;
        this.leave = leave;
        this.alpha = alpha;
    }

    

    public double calcAbsence(){
        double total = present + leave + alpha + sick;
        if (total == 0) return 0;
       return (present * 100.0) / total;
    }

    public void displayAbsence(){
        System.out.println("NIM:\t" + std.nim + "\t|\t Name: " + std.studentName);
        System.out.println("Course Name :\t" + crs.courseName);
        System.out.println("Present:\t" + present + "\t|\t Sick: " + sick + "\t|\t Leave: " + leave + "\t|\t Alpha:" + alpha);
        System.out.printf("Attendance Percentage: %.2f%%\n", calcAbsence());
        System.out.println();
    }



   
}