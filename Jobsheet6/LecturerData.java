package Jobsheet6;

public class LecturerData {
    Lecturer[] lecturerData = new Lecturer[10];
    int idx;

    public void add(Lecturer lecturer){
        if (idx < lecturerData.length) {
            lecturerData[idx] = lecturer;
            idx++;
        } else {
            System.out.println("List is full");
        }
    }

    public void print(){
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    public void sortingAsc(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDsc(){
        for (int i = 1; i < idx; i++) {
            Lecturer temp = lecturerData[i];
            int j = i;
            while (j > 0 && lecturerData[j-1].age < temp.age) {
                lecturerData[j] = lecturerData[j-1];
                j--;
            }
            lecturerData[j] = temp;
        }
    }

    public int findNameSeqSearch(String search){
        int position = -1;
        for (int i = 0; i < lecturerData.length; i++) {
            if (lecturerData[i].name.equalsIgnoreCase(search)) {
                position = i;
                break;
            }
        }
        return position;
    }

    public int findAgeBinarySearch (int search, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (search == lecturerData[mid].age) {
                return (mid);
            } else if (lecturerData[mid].age > search) {
                return findAgeBinarySearch(search, left, mid-1);
            } else {
                return findAgeBinarySearch(search, mid+1, right);
            }
        }

        return -1;
    }

    public void showPositionAndData(String x, int pos){
        if (pos != -1) {
            System.out.println("Name " + x + " is found");
            lecturerData[pos].print();
        } else {
            System.out.println("Name " + x + " is not found");
        }
    }


}
