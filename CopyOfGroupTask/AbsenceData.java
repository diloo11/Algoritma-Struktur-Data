package CopyOfGroupTask;

public class AbsenceData {
    Absence[] listAbsence = new Absence[6];
    Student[] stdArray = new Student[5];
    Course[] crsArray = new Course[3];
    AveragePresention[][] avgPresention = new AveragePresention[3][2];

    public AbsenceData() {
        stdArray[0] = new Student("22001", "Ali Rahman");
        stdArray[1] = new Student("22002", "Budi Santoso");
        stdArray[2] = new Student("22003", "Citra Dewi");
        stdArray[3] = new Student("22004", "Deni Saputra");

        crsArray[0] = new Course("MK001", "Data Structure", 3);
        crsArray[1] = new Course("MK002", "Data Base", 3);
        crsArray[2] = new Course("MK003", "Web Design", 2);

        listAbsence[0] = new Absence(stdArray[0], crsArray[0], 10, 1, 1, 0);
        listAbsence[1] = new Absence(stdArray[0], crsArray[1], 12, 0, 1, 1);
        listAbsence[2] = new Absence(stdArray[1], crsArray[0], 14, 0, 0, 0);
        listAbsence[3] = new Absence(stdArray[2], crsArray[1], 9, 2, 1, 2);
        listAbsence[4] = new Absence(stdArray[2], crsArray[2], 10, 0, 0, 2);
        listAbsence[5] = new Absence(stdArray[3], crsArray[2], 13, 0, 0, 0);

        avgPresention[0][0] = new AveragePresention(listAbsence[0]);
        avgPresention[0][1] = new AveragePresention(listAbsence[2]);
        avgPresention[1][0] = new AveragePresention(listAbsence[1]);
        avgPresention[1][1] = new AveragePresention(listAbsence[3]);
        avgPresention[2][0] = new AveragePresention(listAbsence[4]);
        avgPresention[2][1] = new AveragePresention(listAbsence[5]);

    }

    public void sortData() {
        for (int i = 0; i < listAbsence.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < listAbsence.length; j++) {
                if (listAbsence[j].calcAbsence() > listAbsence[minIndex].calcAbsence()) {
                    minIndex = j;
                }
            }
            Absence temp = listAbsence[minIndex];
            listAbsence[minIndex] = listAbsence[i];
            listAbsence[i] = temp;
        }
    }

    public void searchNim(String searchNim) {
        boolean found = false;
        for (int i = 0; i < listAbsence.length; i++) {
            if (listAbsence[i].std.nim.equals(searchNim)) {
                listAbsence[i].displayAbsence();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data for NIM " + searchNim + " not found");
        }
    }

    public void sortedDisplay() {
        for (int i = 0; i < listAbsence.length; i++) {
            System.out.println(listAbsence[i].calcAbsence() + " - " + listAbsence[i].std.studentName + " - " + listAbsence[i].crs.courseName);
        }
    }

    public void averagePresention() {
        for (int i = 0; i < crsArray.length; i++) {
            int courseavg = 0;
            int totavg = 0;
            int notpass = 0;
            System.out.println("Course Name: " + crsArray[i].courseName);
            for (int j = 0; j < 2; j++) {
                totavg += avgPresention[i][j].Absence.calcAbsence(); 
                if (avgPresention[i][j].Absence.calcAbsence() < 75 ) {
                    notpass ++;
                }
            }
            courseavg = totavg/2;
            System.out.println("Average Attendace: " + courseavg);
            System.out.println("Student Fail: " + notpass);

        }

    }
}
